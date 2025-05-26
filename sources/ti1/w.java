package ti1;

import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class w extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f117756i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SbaPinRep f117757j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(SbaPinRep sbaPinRep, int i13) {
        super(0);
        this.f117756i = i13;
        this.f117757j = sbaPinRep;
    }

    public final u50.r b() {
        u50.r rVar;
        u50.r rVar2;
        u50.r rVar3;
        int i13 = this.f117756i;
        SbaPinRep sbaPinRep = this.f117757j;
        switch (i13) {
            case 0:
                rVar = sbaPinRep.eventIntake;
                return rVar;
            case 1:
                rVar2 = sbaPinRep.eventIntake;
                return new kd1.j(rVar2, 13);
            default:
                rVar3 = sbaPinRep.eventIntake;
                return rVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        yi1.s pinImagePiece;
        switch (this.f117756i) {
            case 0:
                return b();
            case 1:
                return b();
            case 2:
                return b();
            default:
                pinImagePiece = this.f117757j.getPinImagePiece();
                yi1.p pVar = pinImagePiece.f139158k;
                return Integer.valueOf(pVar.f128840c + pVar.f128842e);
        }
    }
}
