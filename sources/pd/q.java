package pd;

/* loaded from: classes.dex */
public final class q extends r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f99743d;

    public q(int i13) {
        this.f99743d = i13;
    }

    @Override // pd.r
    public final boolean a(nd.a aVar) {
        switch (this.f99743d) {
            case 1:
                break;
            case 2:
                if (aVar == nd.a.DATA_DISK_CACHE || aVar == nd.a.MEMORY_CACHE) {
                    break;
                }
                break;
            default:
                if (aVar != nd.a.REMOTE) {
                    break;
                }
                break;
        }
        return false;
    }
}
