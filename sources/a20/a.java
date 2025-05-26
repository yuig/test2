package a20;

import kotlin.text.Regex;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Regex f459a = new Regex("([-a-zA-Z0-9]{0,61}[a-zA-Z0-9]*\\.)?pinterdev\\.com");

    /* renamed from: b, reason: collision with root package name */
    public static final Regex f460b = new Regex("(log|api|api-latest|api-integ|trk|trk2).pinterest.com");

    /* renamed from: c, reason: collision with root package name */
    public static final Regex f461c = new Regex("i.pinimg.com");

    public static final Regex a() {
        return f461c;
    }

    public static final Regex b() {
        return f459a;
    }
}
