package com.amazonaws.logging;

import java.util.HashMap;

/* loaded from: classes3.dex */
public class AndroidLog implements Log {

    /* renamed from: a, reason: collision with root package name */
    public final String f28625a;

    public AndroidLog(String str) {
        this.f28625a = str;
    }

    @Override // com.amazonaws.logging.Log
    public final void a(String str, Exception exc) {
        HashMap hashMap = LogFactory.f28627a;
        android.util.Log.d(this.f28625a, str.toString(), exc);
    }

    @Override // com.amazonaws.logging.Log
    public final boolean b() {
        if (!android.util.Log.isLoggable(this.f28625a, 3)) {
            return false;
        }
        HashMap hashMap = LogFactory.f28627a;
        return true;
    }

    @Override // com.amazonaws.logging.Log
    public final void c(String str) {
        HashMap hashMap = LogFactory.f28627a;
        android.util.Log.e(this.f28625a, str.toString());
    }

    @Override // com.amazonaws.logging.Log
    public final void d(String str, Exception exc) {
        HashMap hashMap = LogFactory.f28627a;
        android.util.Log.e(this.f28625a, str.toString(), exc);
    }

    @Override // com.amazonaws.logging.Log
    public final boolean e() {
        if (!android.util.Log.isLoggable(this.f28625a, 6)) {
            return false;
        }
        HashMap hashMap = LogFactory.f28627a;
        return true;
    }

    @Override // com.amazonaws.logging.Log
    public final void f(String str) {
        HashMap hashMap = LogFactory.f28627a;
        android.util.Log.d(this.f28625a, str.toString());
    }

    @Override // com.amazonaws.logging.Log
    public final void g(String str) {
        HashMap hashMap = LogFactory.f28627a;
        android.util.Log.i(this.f28625a, str.toString());
    }

    @Override // com.amazonaws.logging.Log
    public final void h(String str) {
        HashMap hashMap = LogFactory.f28627a;
        android.util.Log.w(this.f28625a, str.toString());
    }

    @Override // com.amazonaws.logging.Log
    public final void i(String str) {
        HashMap hashMap = LogFactory.f28627a;
        android.util.Log.v(this.f28625a, str.toString());
    }

    @Override // com.amazonaws.logging.Log
    public final void j(String str, Exception exc) {
        HashMap hashMap = LogFactory.f28627a;
        android.util.Log.w(this.f28625a, str.toString(), exc);
    }
}
