package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t3.s1;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "", "toIntOrNull", "(Ljava/lang/String;)Ljava/lang/Integer;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/text/StringsKt")
/* loaded from: classes2.dex */
public class StringsKt__StringNumberConversionsKt extends y {
    public static final void f(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        throw new NumberFormatException(s1.b("Invalid number format: '", input, '\''));
    }

    public static Integer toIntOrNull(@NotNull String str) {
        boolean z13;
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i15 = 0;
        char charAt = str.charAt(0);
        int i16 = -2147483647;
        if (Intrinsics.i(charAt, 48) < 0) {
            i13 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                i16 = Integer.MIN_VALUE;
                z13 = true;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z13 = false;
            }
        } else {
            z13 = false;
            i13 = 0;
        }
        int i17 = -59652323;
        while (i13 < length) {
            int digit = Character.digit((int) str.charAt(i13), 10);
            if (digit < 0) {
                return null;
            }
            if ((i15 < i17 && (i17 != -59652323 || i15 < (i17 = i16 / 10))) || (i14 = i15 * 10) < i16 + digit) {
                return null;
            }
            i15 = i14 - digit;
            i13++;
        }
        return z13 ? Integer.valueOf(i15) : Integer.valueOf(-i15);
    }
}
