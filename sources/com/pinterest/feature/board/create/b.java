package com.pinterest.feature.board.create;

import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f45144a = Pattern.compile("[\\p{L}0-9\\-+_~]+");

    public static final boolean a(CharSequence s13, Integer num) {
        Intrinsics.checkNotNullParameter(s13, "s");
        return (z.j(s13) ^ true) && f45144a.matcher(s13.toString()).find() && (num == null || s13.length() <= num.intValue());
    }
}
