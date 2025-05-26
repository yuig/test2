package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final g f80487d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f80488a;

    /* renamed from: b, reason: collision with root package name */
    public final e f80489b;

    /* renamed from: c, reason: collision with root package name */
    public final f f80490c;

    static {
        e eVar = e.f80485a;
        f fVar = f.f80486a;
        f80487d = new g(false, eVar, fVar);
        new g(true, eVar, fVar);
    }

    public g(boolean z13, e bytes, f number) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(number, "number");
        this.f80488a = z13;
        this.f80489b = bytes;
        this.f80490c = number;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("HexFormat(");
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        sb3.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        sb3.append("    upperCase = ");
        sb3.append(this.f80488a);
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        sb3.append(",");
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        sb3.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        sb3.append("    bytes = BytesHexFormat(");
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        sb3.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        this.f80489b.a("        ", sb3);
        sb3.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        sb3.append("    ),");
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        sb3.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        sb3.append("    number = NumberHexFormat(");
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        sb3.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        this.f80490c.a("        ", sb3);
        sb3.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        sb3.append("    )");
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        sb3.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        sb3.append(")");
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }
}
