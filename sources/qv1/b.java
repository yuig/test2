package qv1;

import com.pinterest.api.model.wy0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class b extends s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f105243j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f105244k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f105245l = new b(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f105246i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(0);
        this.f105246i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f105246i) {
            case 0:
                return "SearchHeader";
            case 1:
                return null;
            default:
                wy0 f13 = ((b60.d) com.bumptech.glide.d.E()).f();
                return Boolean.valueOf(Intrinsics.d(f13 != null ? f13.G2() : null, "US"));
        }
    }
}
