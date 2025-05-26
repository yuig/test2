package ym2;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes4.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Regex f139480a = new Regex("[^\\p{L}\\p{Digit}]");

    /* renamed from: b, reason: collision with root package name */
    public static final String f139481b = "$context_receiver";

    public static final g a(int i13) {
        g e13 = g.e(f139481b + '_' + i13);
        Intrinsics.checkNotNullExpressionValue(e13, "identifier(...)");
        return e13;
    }

    public static final String b(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return f139480a.replace(name, "_");
    }
}
