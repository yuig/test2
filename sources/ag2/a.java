package ag2;

import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.Regex;

/* loaded from: classes4.dex */
public final class a extends s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f15153j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f15154k = new a(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15155i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(0);
        this.f15155i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15155i) {
            case 0:
                return 32;
            default:
                Pattern compile = Pattern.compile("^[0-9a-fA-F]{32}$");
                Intrinsics.checkNotNullExpressionValue(compile, "compile(\"^[0-9a-fA-F]{32}\\$\")");
                return new Regex(compile);
        }
    }
}
