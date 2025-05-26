package com.amazonaws.util;

import java.nio.charset.Charset;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class StringUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f29048a = Charset.forName("UTF-8");

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        return str.isEmpty() ? "" : str.toLowerCase(Locale.ENGLISH);
    }
}
