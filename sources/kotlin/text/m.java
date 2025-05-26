package kotlin.text;

import java.io.Serializable;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class m implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final l f80497c = new l(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f80498a;

    /* renamed from: b, reason: collision with root package name */
    public final int f80499b;

    public m(String pattern, int i13) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        this.f80498a = pattern;
        this.f80499b = i13;
    }

    private final Object readResolve() {
        Pattern compile = Pattern.compile(this.f80498a, this.f80499b);
        Intrinsics.checkNotNullExpressionValue(compile, "compile(...)");
        return new Regex(compile);
    }
}
