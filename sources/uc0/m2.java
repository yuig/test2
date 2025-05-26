package uc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m2 extends p2 {

    /* renamed from: c, reason: collision with root package name */
    public final String f121830c;

    /* renamed from: d, reason: collision with root package name */
    public final String f121831d;

    /* renamed from: e, reason: collision with root package name */
    public final int f121832e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(String title, int i13, String description, String lightColor, String darkColor) {
        super(title, description);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(lightColor, "lightColor");
        Intrinsics.checkNotNullParameter(darkColor, "darkColor");
        this.f121830c = lightColor;
        this.f121831d = darkColor;
        this.f121832e = i13;
    }
}
