package w80;

import android.content.Context;
import com.pinterest.feature.ideaPinCreation.drawing.IdeaPinHandDrawingView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f128297i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ IdeaPinHandDrawingView f128298j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f128299k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(IdeaPinHandDrawingView ideaPinHandDrawingView, float f13, int i13) {
        super(1);
        this.f128297i = i13;
        this.f128298j = ideaPinHandDrawingView;
        this.f128299k = f13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f13 = this.f128299k;
        IdeaPinHandDrawingView ideaPinHandDrawingView = this.f128298j;
        int i13 = this.f128297i;
        switch (i13) {
            case 0:
                Context it = (Context) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it, "it");
                        ideaPinHandDrawingView.f46519k = Float.valueOf(f13);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        ideaPinHandDrawingView.f46519k = Float.valueOf(f13);
                        break;
                }
            default:
                Context it2 = (Context) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        ideaPinHandDrawingView.f46519k = Float.valueOf(f13);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        ideaPinHandDrawingView.f46519k = Float.valueOf(f13);
                        break;
                }
        }
        return ideaPinHandDrawingView;
    }
}
