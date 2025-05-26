package fx;

import android.content.res.TypedArray;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.h0;

/* loaded from: classes3.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f63068j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f63069k = new b(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f63070i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f63070i = i13;
    }

    public final f b(TypedArray $receiver) {
        h0 h0Var = h0.f120562a;
        switch (this.f63070i) {
            case 0:
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                break;
            default:
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                break;
        }
        return new f(h0Var, null, null, null, false, 0, RecyclerViewTypes.VIEW_TYPE_STORY_BLOCK_PATTERN);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f63070i) {
        }
        return b((TypedArray) obj);
    }
}
