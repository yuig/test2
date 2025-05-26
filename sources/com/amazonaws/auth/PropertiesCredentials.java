package com.amazonaws.auth;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/* loaded from: classes3.dex */
public class PropertiesCredentials implements AWSCredentials {

    /* renamed from: a, reason: collision with root package name */
    public final String f28577a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28578b;

    public PropertiesCredentials(File file) {
        if (!file.exists()) {
            throw new FileNotFoundException("File doesn't exist:  " + file.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            if (properties.getProperty("accessKey") == null || properties.getProperty("secretKey") == null) {
                throw new IllegalArgumentException("The specified file (" + file.getAbsolutePath() + ") doesn't contain the expected properties 'accessKey' and 'secretKey'.");
            }
            this.f28577a = properties.getProperty("accessKey");
            this.f28578b = properties.getProperty("secretKey");
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.amazonaws.auth.AWSCredentials
    public final String a() {
        return this.f28577a;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    public final String b() {
        return this.f28578b;
    }
}
