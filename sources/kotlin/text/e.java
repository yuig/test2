package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f80485a = new e();

    public e() {
        Intrinsics.checkNotNullParameter("  ", "groupSeparator");
        Intrinsics.checkNotNullParameter("", "byteSeparator");
        Intrinsics.checkNotNullParameter("", "bytePrefix");
        Intrinsics.checkNotNullParameter("", "byteSuffix");
    }

    public final void a(String indent, StringBuilder sb3) {
        Intrinsics.checkNotNullParameter(sb3, "sb");
        Intrinsics.checkNotNullParameter(indent, "indent");
        sb3.append(indent);
        sb3.append("bytesPerLine = ");
        sb3.append(Integer.MAX_VALUE);
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        sb3.append(",");
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        sb3.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        sb3.append(indent);
        sb3.append("bytesPerGroup = ");
        sb3.append(Integer.MAX_VALUE);
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        sb3.append(",");
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        sb3.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        sb3.append(indent);
        sb3.append("groupSeparator = \"");
        sb3.append("  ");
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        sb3.append("\",");
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        sb3.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        sb3.append(indent);
        sb3.append("byteSeparator = \"");
        sb3.append("");
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        sb3.append("\",");
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        sb3.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        sb3.append(indent);
        sb3.append("bytePrefix = \"");
        sb3.append("");
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        sb3.append("\",");
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        sb3.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        sb3.append(indent);
        sb3.append("byteSuffix = \"");
        sb3.append("");
        sb3.append("\"");
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("BytesHexFormat(");
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
