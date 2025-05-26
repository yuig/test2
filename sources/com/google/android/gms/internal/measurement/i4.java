package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public abstract class i4 {

    /* renamed from: f, reason: collision with root package name */
    public static HashMap f31431f;

    /* renamed from: k, reason: collision with root package name */
    public static Object f31436k;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f31437l;

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f31426a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b, reason: collision with root package name */
    public static final Uri f31427b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f31428c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f31429d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f31430e = new AtomicBoolean();

    /* renamed from: g, reason: collision with root package name */
    public static final HashMap f31432g = new HashMap(16, 1.0f);

    /* renamed from: h, reason: collision with root package name */
    public static final HashMap f31433h = new HashMap(16, 1.0f);

    /* renamed from: i, reason: collision with root package name */
    public static final HashMap f31434i = new HashMap(16, 1.0f);

    /* renamed from: j, reason: collision with root package name */
    public static final HashMap f31435j = new HashMap(16, 1.0f);

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f31438m = new String[0];
}
