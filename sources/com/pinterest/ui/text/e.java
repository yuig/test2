package com.pinterest.ui.text;

import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f52660a;

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f52661b;

    static {
        Pattern compile = Pattern.compile("#[\\p{L}_\\p{N}]+");
        Intrinsics.checkNotNullExpressionValue(compile, "compile(...)");
        f52660a = compile;
        Pattern compile2 = Pattern.compile("[\\p{L}_\\p{N}]");
        Intrinsics.checkNotNullExpressionValue(compile2, "compile(...)");
        f52661b = compile2;
    }
}
