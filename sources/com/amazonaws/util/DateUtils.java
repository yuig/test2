package com.amazonaws.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public class DateUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeZone f29037a = TimeZone.getTimeZone("GMT");

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f29038b = new HashMap();

    public static Date a(Date date) {
        if (date == null) {
            return null;
        }
        return new Date(date.getTime());
    }

    public static String b(String str, Date date) {
        return ((SimpleDateFormat) c(str).get()).format(date);
    }

    public static ThreadLocal c(final String str) {
        HashMap hashMap = f29038b;
        ThreadLocal<SimpleDateFormat> threadLocal = (ThreadLocal) hashMap.get(str);
        if (threadLocal == null) {
            synchronized (hashMap) {
                try {
                    threadLocal = (ThreadLocal) hashMap.get(str);
                    if (threadLocal == null) {
                        threadLocal = new ThreadLocal<SimpleDateFormat>() { // from class: com.amazonaws.util.DateUtils.1
                            @Override // java.lang.ThreadLocal
                            public final SimpleDateFormat initialValue() {
                                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
                                simpleDateFormat.setTimeZone(DateUtils.f29037a);
                                simpleDateFormat.setLenient(false);
                                return simpleDateFormat;
                            }
                        };
                        hashMap.put(str, threadLocal);
                    }
                } finally {
                }
            }
        }
        return threadLocal;
    }

    public static Date d(String str, String str2) {
        try {
            return ((SimpleDateFormat) c(str).get()).parse(str2);
        } catch (ParseException e13) {
            throw new IllegalArgumentException(e13);
        }
    }

    public static Date e(String str) {
        try {
            return d("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", str);
        } catch (IllegalArgumentException unused) {
            return d("yyyy-MM-dd'T'HH:mm:ss'Z'", str);
        }
    }
}
