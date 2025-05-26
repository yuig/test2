package uc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o2 extends p2 {

    /* renamed from: c, reason: collision with root package name */
    public final String f121841c;

    /* renamed from: d, reason: collision with root package name */
    public final int f121842d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(String title, String description, String value, int i13) {
        super(title, description);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f121841c = value;
        this.f121842d = i13;
    }
}
