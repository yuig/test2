package com.amazonaws.util;

import com.amazonaws.logging.LogFactory;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes3.dex */
public abstract class Md5Utils {
    public static byte[] a(InputStream inputStream) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                byte[] bArr = new byte[16384];
                while (true) {
                    int read = bufferedInputStream.read(bArr, 0, 16384);
                    if (read == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, read);
                }
                byte[] digest = messageDigest.digest();
                try {
                    bufferedInputStream.close();
                } catch (Exception e13) {
                    LogFactory.a(Md5Utils.class).f("Unable to close input stream of hash candidate: " + e13);
                }
                return digest;
            } catch (Throwable th3) {
                try {
                    bufferedInputStream.close();
                } catch (Exception e14) {
                    LogFactory.a(Md5Utils.class).f("Unable to close input stream of hash candidate: " + e14);
                }
                throw th3;
            }
        } catch (NoSuchAlgorithmException e15) {
            throw new IllegalStateException(e15);
        }
    }
}
