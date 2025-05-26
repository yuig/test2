package ir;

import h32.a4;
import h32.d4;
import h32.i0;
import nx.w0;

/* loaded from: classes3.dex */
public final class v extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73486a;

    public v(int i13) {
        this.f73486a = i13;
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        switch (this.f73486a) {
            case 0:
                return new i0(d4.APP_SHORTCUT, null, null, null, null, null);
            case 1:
                return new i0(d4.EXT_VOICE_SEARCH, null, null, null, null, null);
            case 2:
            default:
                return new i0(d4.SERVICE_ENTRY_DIRECT, a4.EXTERNAL_SOURCE_OTHER, null, null, null, null);
            case 3:
                return new i0(d4.SERVICE_ENTRY_PAID, a4.SERVICE_ENTRY_PAID_SAMSUNG_MAPS, null, null, null, null);
        }
    }
}
