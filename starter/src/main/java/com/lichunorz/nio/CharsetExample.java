package com.lichunorz.nio;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;

public class CharsetExample {

    private static final String inputFile = "txt/nio-charset-example-in.txt";
    private static final String outputFile = "txt/nio-charset-example-out.txt";

    public static void main(String[] args) throws IOException {
        final RandomAccessFile inputRandomAccessFile = new RandomAccessFile(inputFile, "r");
        final RandomAccessFile outputRandomAccessFile = new RandomAccessFile(outputFile, "rw");

        final long length = new File(inputFile).length();
        final FileChannel inputFileChannel = inputRandomAccessFile.getChannel();
        final FileChannel outputFileChannel = outputRandomAccessFile.getChannel();

        final MappedByteBuffer inputData = inputFileChannel.map(FileChannel.MapMode.READ_ONLY, 0, length);

        Charset charset = StandardCharsets.ISO_8859_1;
        CharsetDecoder charsetDecoder = charset.newDecoder();
        CharsetEncoder charsetEncoder = charset.newEncoder();

        final CharBuffer charBuffer = charsetDecoder.decode(inputData);

        outputFileChannel.write(charsetEncoder.encode(charBuffer));

        inputRandomAccessFile.close();
        outputRandomAccessFile.close();
    }
}
