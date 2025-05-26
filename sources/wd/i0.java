package wd;

/* loaded from: classes3.dex */
public final class i0 extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129172a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(int i13) {
        super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        this.f129172a = i13;
        if (i13 != 2) {
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        switch (this.f129172a) {
            case 2:
                return "Chain of Causes for CompositeException In Order Received =>";
            default:
                return super.getMessage();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Throwable th3) {
        super(th3);
        this.f129172a = 1;
    }
}
