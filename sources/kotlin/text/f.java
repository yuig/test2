package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f80486a = new f();

    public f() {
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "suffix");
    }

    public final void a(String indent, StringBuilder sb3) {
        Intrinsics.checkNotNullParameter(sb3, "sb");
        Intrinsics.checkNotNullParameter(indent, "indent");
        sb3.append(indent);
        sb3.append("prefix = \"");
        sb3.append("");
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        sb3.append("\",");
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        sb3.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        sb3.append(indent);
        sb3.append("suffix = \"");
        sb3.append("");
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        sb3.append("\",");
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        sb3.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        sb3.append(indent);
        sb3.append("removeLeadingZeros = ");
        sb3.append(false);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("NumberHexFormat(");
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        sb3.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        a("    ", sb3);
        sb3.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        sb3.append(")");
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }
}
