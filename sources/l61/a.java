package l61;

import android.content.Context;
import com.pinterest.feature.search.results.goldstandard.views.GoldStandardActionView;
import com.pinterest.feature.search.results.goldstandard.views.GoldStandardImageAndTextView;
import com.pinterest.feature.search.results.goldstandard.views.GoldStandardTextView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f81589i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f81590j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(d dVar, int i13) {
        super(0);
        this.f81589i = i13;
        this.f81590j = dVar;
    }

    public final GoldStandardImageAndTextView b() {
        int i13 = this.f81589i;
        d dVar = this.f81590j;
        switch (i13) {
            case 1:
                Context requireContext = dVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                GoldStandardImageAndTextView goldStandardImageAndTextView = new GoldStandardImageAndTextView(requireContext);
                goldStandardImageAndTextView.f47649e = new b(dVar, 0);
                return goldStandardImageAndTextView;
            default:
                Context requireContext2 = dVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                GoldStandardImageAndTextView goldStandardImageAndTextView2 = new GoldStandardImageAndTextView(requireContext2);
                goldStandardImageAndTextView2.f47649e = new b(dVar, 1);
                return goldStandardImageAndTextView2;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f81589i;
        d dVar = this.f81590j;
        switch (i13) {
            case 0:
                Context requireContext = dVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new GoldStandardTextView(requireContext);
            case 1:
                return b();
            case 2:
                return b();
            default:
                Context requireContext2 = dVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                GoldStandardActionView goldStandardActionView = new GoldStandardActionView(requireContext2);
                goldStandardActionView.f47643d = new c(dVar);
                return goldStandardActionView;
        }
    }
}
