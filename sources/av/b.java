package av;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import com.pinterest.ads.feature.owc.view.story.AdsStoryScrollingModule;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20505i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f20506j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, int i13) {
        super(0);
        this.f20505i = i13;
        this.f20506j = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f20505i;
        d dVar = this.f20506j;
        switch (i13) {
            case 0:
                Context context = dVar.getLayoutInflater().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                a aVar = new a(context, dVar.f53234n0);
                aVar.setLayoutParams(new androidx.coordinatorlayout.widget.c(-1, -1));
                return aVar;
            case 1:
                int i14 = d.G0;
                return new AdsStoryScrollingModule(6, dVar.f8(), (AttributeSet) null);
            default:
                int i15 = d.G0;
                String lastPathSegment = Uri.parse(dVar.getPin().s5()).getLastPathSegment();
                return lastPathSegment == null ? "" : lastPathSegment;
        }
    }
}
