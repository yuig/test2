package kotlin.text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u000f2\u00060\u0001j\u0002`\u0002:\u0002\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "", "input", "", "replacement", "replace", "(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;", "pattern", "<init>", "(Ljava/lang/String;)V", "b", "kotlin/text/k", "kotlin/text/m", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class Regex implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final k f80467b = new k(null);

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f80468a;

    public Regex(Pattern nativePattern) {
        Intrinsics.checkNotNullParameter(nativePattern, "nativePattern");
        this.f80468a = nativePattern;
    }

    public static yn2.m c(Regex regex, CharSequence input) {
        regex.getClass();
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.length() < 0) {
            StringBuilder s13 = a.a.s("Start index out of bounds: ", 0, ", input length: ");
            s13.append(input.length());
            throw new IndexOutOfBoundsException(s13.toString());
        }
        n seedFunction = new n(regex, input, 0);
        o nextFunction = o.f80503a;
        Intrinsics.checkNotNullParameter(seedFunction, "seedFunction");
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return new yn2.m(seedFunction, nextFunction);
    }

    private final Object writeReplace() {
        Pattern pattern = this.f80468a;
        String pattern2 = pattern.pattern();
        Intrinsics.checkNotNullExpressionValue(pattern2, "pattern(...)");
        return new m(pattern2, pattern.flags());
    }

    public final boolean a(CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.f80468a.matcher(input).find();
    }

    public final j b(int i13, CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher matcher = this.f80468a.matcher(input);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        if (matcher.find(i13)) {
            return new j(matcher, input);
        }
        return null;
    }

    public final j d(CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher matcher = this.f80468a.matcher(input);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        if (matcher.matches()) {
            return new j(matcher, input);
        }
        return null;
    }

    public final boolean e(CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.f80468a.matcher(input).matches();
    }

    public final List f(int i13, CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        StringsKt__StringsKt.u(i13);
        Matcher matcher = this.f80468a.matcher(input);
        if (i13 == 1 || !matcher.find()) {
            return kotlin.collections.e0.b(input.toString());
        }
        int i14 = 10;
        if (i13 > 0 && i13 <= 10) {
            i14 = i13;
        }
        ArrayList arrayList = new ArrayList(i14);
        int i15 = i13 - 1;
        int i16 = 0;
        do {
            arrayList.add(input.subSequence(i16, matcher.start()).toString());
            i16 = matcher.end();
            if (i15 >= 0 && arrayList.size() == i15) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(i16, input.length()).toString());
        return arrayList;
    }

    @NotNull
    public final String replace(@NotNull CharSequence input, @NotNull String replacement) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        String replaceAll = this.f80468a.matcher(input).replaceAll(replacement);
        Intrinsics.checkNotNullExpressionValue(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final String toString() {
        String pattern = this.f80468a.toString();
        Intrinsics.checkNotNullExpressionValue(pattern, "toString(...)");
        return pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Regex(@org.jetbrains.annotations.NotNull java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Regex(java.lang.String r2, kotlin.text.p r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "option"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.text.k r0 = kotlin.text.Regex.f80467b
            int r3 = r3.getValue()
            r0.getClass()
            r0 = r3 & 2
            if (r0 == 0) goto L19
            r3 = r3 | 64
        L19:
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String, kotlin.text.p):void");
    }
}
