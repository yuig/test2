package v;

import com.google.android.gms.internal.measurement.q4;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final /* synthetic */ class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123744a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.d f123745b;

    public /* synthetic */ y(androidx.appcompat.app.d dVar, int i13) {
        this.f123744a = i13;
        this.f123745b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f123744a) {
            case 0:
                androidx.appcompat.app.d dVar = this.f123745b;
                int i13 = 1;
                if (!((AtomicBoolean) dVar.f15967c).getAndSet(true)) {
                    ((d0) ((q4) dVar.f15968d).f31595c).f123398c.execute(new y(dVar, i13));
                    break;
                }
                break;
            default:
                androidx.appcompat.app.d dVar2 = this.f123745b;
                if (((d0) ((q4) dVar2.f15968d).f31595c).f123400e == z.OPENING) {
                    ((d0) ((q4) dVar2.f15968d).f31595c).t("Camera onError timeout, reopen it.", null);
                    ((d0) ((q4) dVar2.f15968d).f31595c).E(z.REOPENING);
                    ((d0) ((q4) dVar2.f15968d).f31595c).f123404i.b();
                    break;
                } else {
                    ((d0) ((q4) dVar2.f15968d).f31595c).t("Camera skip reopen at state: " + ((d0) ((q4) dVar2.f15968d).f31595c).f123400e, null);
                    break;
                }
        }
    }
}
