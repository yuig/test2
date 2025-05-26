package com.amazonaws.handlers;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import com.amazonaws.AmazonClientException;
import com.amazonaws.util.ClassLoaderHelper;
import com.amazonaws.util.StringUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class HandlerChainFactory {
    public final ArrayList a(Class cls, String str) {
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = null;
        try {
            try {
                InputStream resourceAsStream = getClass().getResourceAsStream(str);
                if (resourceAsStream == null) {
                    return arrayList;
                }
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(resourceAsStream, StringUtils.f29048a));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException unused) {
                            }
                            return arrayList;
                        }
                        String trim = readLine.trim();
                        if (!"".equals(trim)) {
                            Object newInstance = ClassLoaderHelper.loadClass(trim, cls, getClass()).newInstance();
                            if (!cls.isInstance(newInstance)) {
                                throw new AmazonClientException("Unable to instantiate request handler chain for client.  Listed request handler ('" + trim + "') does not implement the " + cls + " API.");
                            }
                            if (cls != RequestHandler2.class) {
                                if (cls != RequestHandler.class) {
                                    throw new IllegalStateException();
                                }
                                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(newInstance);
                                new RequestHandler2Adaptor();
                                throw new IllegalArgumentException();
                            }
                            arrayList.add((RequestHandler2) newInstance);
                        }
                    } catch (Exception e13) {
                        e = e13;
                        bufferedReader = bufferedReader2;
                        throw new AmazonClientException("Unable to instantiate request handler chain for client: " + e.getMessage(), e);
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e14) {
            e = e14;
        }
    }
}
