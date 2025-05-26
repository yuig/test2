package g7;

import java.util.Map;

/* loaded from: classes3.dex */
public final /* synthetic */ class m implements ok.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63813a;

    @Override // ok.w
    public final boolean apply(Object obj) {
        switch (this.f63813a) {
            case 0:
                if (((Map.Entry) obj).getKey() != null) {
                    break;
                }
                break;
            default:
                if (((String) obj) != null) {
                    break;
                }
                break;
        }
        return true;
    }
}
