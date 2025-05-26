package com.amazonaws.logging;

import com.amazonaws.logging.LogFactory;
import java.io.PrintStream;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class ConsoleLog implements Log {

    /* renamed from: a, reason: collision with root package name */
    public final String f28626a;

    public ConsoleLog(String str) {
        this.f28626a = str;
    }

    @Override // com.amazonaws.logging.Log
    public final void a(String str, Exception exc) {
        HashMap hashMap = LogFactory.f28627a;
        k(LogFactory.Level.DEBUG, str, exc);
    }

    @Override // com.amazonaws.logging.Log
    public final boolean b() {
        HashMap hashMap = LogFactory.f28627a;
        return true;
    }

    @Override // com.amazonaws.logging.Log
    public final void c(String str) {
        HashMap hashMap = LogFactory.f28627a;
        k(LogFactory.Level.ERROR, str, null);
    }

    @Override // com.amazonaws.logging.Log
    public final void d(String str, Exception exc) {
        HashMap hashMap = LogFactory.f28627a;
        k(LogFactory.Level.ERROR, str, exc);
    }

    @Override // com.amazonaws.logging.Log
    public final boolean e() {
        HashMap hashMap = LogFactory.f28627a;
        return true;
    }

    @Override // com.amazonaws.logging.Log
    public final void f(String str) {
        HashMap hashMap = LogFactory.f28627a;
        k(LogFactory.Level.DEBUG, str, null);
    }

    @Override // com.amazonaws.logging.Log
    public final void g(String str) {
        HashMap hashMap = LogFactory.f28627a;
        k(LogFactory.Level.INFO, str, null);
    }

    @Override // com.amazonaws.logging.Log
    public final void h(String str) {
        HashMap hashMap = LogFactory.f28627a;
        k(LogFactory.Level.WARN, str, null);
    }

    @Override // com.amazonaws.logging.Log
    public final void i(String str) {
        HashMap hashMap = LogFactory.f28627a;
        k(LogFactory.Level.TRACE, str, null);
    }

    @Override // com.amazonaws.logging.Log
    public final void j(String str, Exception exc) {
        HashMap hashMap = LogFactory.f28627a;
        k(LogFactory.Level.WARN, str, exc);
    }

    public final void k(LogFactory.Level level, String str, Exception exc) {
        PrintStream printStream = System.out;
        printStream.printf("%s/%s: %s\n", this.f28626a, level.name(), str);
        if (exc != null) {
            printStream.println(exc.toString());
        }
    }
}
