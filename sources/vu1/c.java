package vu1;

import okhttp3.Call;
import okhttp3.ResponseBody;
import tu1.z0;

/* loaded from: classes2.dex */
public final class c extends z0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f126657f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Call f126658g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(ResponseBody responseBody, Call call, boolean z13, int i13) {
        super(responseBody, z13);
        this.f126657f = i13;
        this.f126658g = call;
    }

    @Override // tu1.z0
    public final void a() {
        int i13 = this.f126657f;
        Call call = this.f126658g;
        switch (i13) {
            case 0:
                d dVar = (d) call;
                dVar.f126666g.k();
                dVar.f126663d.d(dVar);
                break;
            default:
                i iVar = (i) call;
                iVar.f126681g.k();
                iVar.f126678d.d(iVar);
                break;
        }
    }
}
