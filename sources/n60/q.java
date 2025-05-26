package n60;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.c2;
import lh0.d3;
import lh0.g2;
import lh0.k3;
import lh0.k4;
import lh0.n1;
import so.oa;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f89278i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s f89279j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(s sVar, int i13) {
        super(0);
        this.f89278i = i13;
        this.f89279j = sVar;
    }

    public final se2.a b() {
        int i13 = this.f89278i;
        s sVar = this.f89279j;
        switch (i13) {
            case 0:
                return bf2.b.a(((oa) sVar.f()).f113850p0);
            case 1:
                return bf2.b.a(((oa) sVar.f()).M1);
            case 2:
                return bf2.b.a(((oa) sVar.f()).V1);
            case 3:
                return bf2.b.a(((oa) sVar.f()).f113920t0);
            case 4:
                return bf2.b.a(((oa) sVar.f()).f113769k7);
            case 5:
                return bf2.b.a(((oa) sVar.f()).f113797m0);
            case 6:
            case 14:
            case 16:
            case 17:
            case 18:
            case 26:
            default:
                return bf2.b.a(((oa) sVar.f()).f113817n2);
            case 7:
                return bf2.b.a(((oa) sVar.f()).f113613b9);
            case 8:
                return bf2.b.a(((oa) sVar.f()).N0);
            case 9:
                return bf2.b.a(((oa) sVar.f()).B0);
            case 10:
                return bf2.b.a(((oa) sVar.f()).f113630c9);
            case 11:
                return bf2.b.a(((oa) sVar.f()).f113647d9);
            case 12:
                return bf2.b.a(((oa) sVar.f()).f113665e9);
            case 13:
                return bf2.b.a(((oa) sVar.f()).G9);
            case 15:
                return bf2.b.a(((oa) sVar.f()).f113885r0);
            case 19:
                return bf2.b.a(((oa) sVar.f()).U1);
            case 20:
                return bf2.b.a(((oa) sVar.f()).f113781l1);
            case 21:
                return bf2.b.a(((oa) sVar.f()).f113947u9);
            case 22:
                return bf2.b.a(((oa) sVar.f()).f113869q1);
            case 23:
                return bf2.b.a(((oa) sVar.f()).f113683f9);
            case 24:
                return bf2.b.a(((oa) sVar.f()).f113873q5);
            case 25:
                return bf2.b.a(((oa) sVar.f()).f113701g9);
            case 27:
                return bf2.b.a(((oa) sVar.f()).R1);
            case 28:
                return bf2.b.a(((oa) sVar.f()).f113921t1);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f89278i;
        s sVar = this.f89279j;
        switch (i13) {
            case 16:
                oa oaVar = (oa) sVar.f();
                se2.a repositoryExperimentsLazy = bf2.b.a(oaVar.f113993x1);
                se2.a videoExperimentsLazy = bf2.b.a(oaVar.Q0);
                se2.a networkingExperiments = bf2.b.a(oaVar.f113965v9);
                se2.a locationExperiments = bf2.b.a(oaVar.f113983w9);
                se2.a securityRecaptchaExperiments = bf2.b.a(oaVar.f114001x9);
                se2.a notificationsExperimentHelper = bf2.b.a(oaVar.f114019y9);
                se2.a adFormatsLibraryExperiments = bf2.b.a(oaVar.Q6);
                se2.a pagedListLibraryExperiments = bf2.b.a(oaVar.E0);
                Intrinsics.checkNotNullParameter(repositoryExperimentsLazy, "repositoryExperimentsLazy");
                Intrinsics.checkNotNullParameter(videoExperimentsLazy, "videoExperimentsLazy");
                Intrinsics.checkNotNullParameter(networkingExperiments, "networkingExperiments");
                Intrinsics.checkNotNullParameter(locationExperiments, "locationExperiments");
                Intrinsics.checkNotNullParameter(securityRecaptchaExperiments, "securityRecaptchaExperiments");
                Intrinsics.checkNotNullParameter(notificationsExperimentHelper, "notificationsExperimentHelper");
                Intrinsics.checkNotNullParameter(adFormatsLibraryExperiments, "adFormatsLibraryExperiments");
                Intrinsics.checkNotNullParameter(pagedListLibraryExperiments, "pagedListLibraryExperiments");
                ap1.b bVar = new ap1.b();
                d3.f83328b.g(new ap1.a(repositoryExperimentsLazy, 0));
                k4.f83408b.g(new ap1.a(videoExperimentsLazy, 1));
                g2.f83370b.g(new ap1.a(networkingExperiments, 2));
                c2.f83314b.g(new ap1.a(locationExperiments, 3));
                k3.f83404b.g(new ap1.a(securityRecaptchaExperiments, 4));
                gv1.f fVar = gv1.f.f66167e;
                ap1.a aVar = new ap1.a(notificationsExperimentHelper, 5);
                Intrinsics.checkNotNullParameter(aVar, "<set-?>");
                gv1.f.f66168f = aVar;
                lh0.d.f83320b.g(new ap1.a(adFormatsLibraryExperiments, 6));
                n1.f83436b.g(new ap1.a(pagedListLibraryExperiments, 7));
                break;
        }
        return b();
    }
}
