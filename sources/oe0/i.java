package oe0;

import com.pinterest.design.brio.widget.voice.PinterestVoiceMessage;

/* loaded from: classes5.dex */
public final /* synthetic */ class i implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94238a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f94239b;

    public /* synthetic */ i(l lVar, int i13) {
        this.f94238a = i13;
        this.f94239b = lVar;
    }

    @Override // oe0.f
    public final void b() {
        int i13 = this.f94238a;
        l lVar = this.f94239b;
        switch (i13) {
            case 0:
                if (lVar.f94246e == k.ANIMATING_IN) {
                    PinterestVoiceMessage pinterestVoiceMessage = lVar.f94243b;
                    pinterestVoiceMessage.animate().cancel();
                    float currentTimeMillis = (System.currentTimeMillis() - lVar.f94250i) / 500;
                    if (currentTimeMillis >= 1.0f) {
                        pinterestVoiceMessage.setAlpha(1.0f);
                        lVar.f94246e = k.ACTIVATED;
                        break;
                    } else {
                        lVar.b(currentTimeMillis);
                        break;
                    }
                }
                break;
            default:
                lVar.b(0.0f);
                break;
        }
    }
}
