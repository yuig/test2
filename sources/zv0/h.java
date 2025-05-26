package zv0;

import a.m2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lh0.s1;

/* loaded from: classes5.dex */
public final class h extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f142874i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f142875j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j jVar, int i13) {
        super(0);
        this.f142874i = i13;
        this.f142875j = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f142874i;
        j jVar = this.f142875j;
        switch (i13) {
            case 0:
                float f13 = hf0.b.f69002b;
                int i14 = j.f142878k1;
                return Float.valueOf((f13 - ((Number) jVar.U0.getValue()).intValue()) / 2);
            case 1:
                s1 s1Var = jVar.A0;
                if (s1Var != null) {
                    return Boolean.valueOf(s1Var.f());
                }
                Intrinsics.r("experiments");
                throw null;
            case 2:
                return new m2(jVar, 12);
            default:
                return Integer.valueOf(jVar.getResources().getDimensionPixelOffset(aq1.b.story_pin_video_trimmer_preview_width));
        }
    }
}
