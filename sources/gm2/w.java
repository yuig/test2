package gm2;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class w extends y {

    /* renamed from: a, reason: collision with root package name */
    public final Field f65792a;

    public w(Field member) {
        Intrinsics.checkNotNullParameter(member, "member");
        this.f65792a = member;
    }

    @Override // gm2.y
    public final Member b() {
        return this.f65792a;
    }
}
