package sf1;

import android.view.View;
import com.pinterest.feature.storypin.closeup.view.IdeaPinScrubber;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h0 f112568a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f112569b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f112570c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f112571d;

    public f0(h0 h0Var, List list, List list2, long j13) {
        this.f112568a = h0Var;
        this.f112569b = list;
        this.f112570c = list2;
        this.f112571d = j13;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
        view.removeOnLayoutChangeListener(this);
        IdeaPinScrubber ideaPinScrubber = this.f112568a.f112590o;
        ideaPinScrubber.getClass();
        List pagesDurationPercentage = this.f112569b;
        Intrinsics.checkNotNullParameter(pagesDurationPercentage, "pagesDurationPercentage");
        List pagesDurationMs = this.f112570c;
        Intrinsics.checkNotNullParameter(pagesDurationMs, "pagesDurationMs");
        ideaPinScrubber.f48564g = pagesDurationPercentage.size();
        ArrayList arrayList = ideaPinScrubber.f48567j;
        arrayList.clear();
        arrayList.addAll(pagesDurationPercentage);
        ArrayList arrayList2 = ideaPinScrubber.f48568k;
        arrayList2.clear();
        arrayList2.addAll(pagesDurationMs);
        ideaPinScrubber.f48569l = this.f112571d;
        ideaPinScrubber.a(pagesDurationPercentage);
        int i24 = ideaPinScrubber.f48564g;
        LinkedHashMap linkedHashMap = ideaPinScrubber.f48566i;
        n0 n0Var = n0.f112662b;
        linkedHashMap.clear();
        for (int i25 = 0; i25 < i24; i25++) {
            linkedHashMap.put(Integer.valueOf(i25), n0Var);
        }
        ideaPinScrubber.invalidate();
    }
}
