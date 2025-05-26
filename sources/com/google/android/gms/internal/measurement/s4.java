package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* loaded from: classes3.dex */
public abstract class s4 {

    /* renamed from: a, reason: collision with root package name */
    public static final g1.g f31634a = new g1.g();

    public static synchronized Uri a(String str) {
        Uri uri;
        synchronized (s4.class) {
            g1.g gVar = f31634a;
            uri = (Uri) gVar.get(str);
            if (uri == null) {
                uri = Uri.parse("content://com.google.android.gms.phenotype/" + Uri.encode(str));
                gVar.put(str, uri);
            }
        }
        return uri;
    }
}
