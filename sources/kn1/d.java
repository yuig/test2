package kn1;

import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.sheet.header.GestaltSheetHeader;
import hn1.p;
import hn1.q;
import hn1.w;
import java.util.ArrayList;
import kh2.g3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.k0;
import xm1.k;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f80246i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltSheetHeader f80247j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b f80248k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(GestaltSheetHeader gestaltSheetHeader, b bVar, int i13) {
        super(1);
        this.f80246i = i13;
        this.f80247j = gestaltSheetHeader;
        this.f80248k = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Pair pair;
        int i13 = this.f80246i;
        b bVar = this.f80248k;
        GestaltSheetHeader gestaltSheetHeader = this.f80247j;
        switch (i13) {
            case 0:
                b it = (b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                q qVar = GestaltSheetHeader.f49579n;
                gestaltSheetHeader.X(bVar, it);
                return Unit.f80348a;
            default:
                Intrinsics.checkNotNullParameter((p) obj, "it");
                q qVar2 = GestaltSheetHeader.f49579n;
                gestaltSheetHeader.getClass();
                p pVar = bVar.f80238f;
                if (pVar == p.NONE) {
                    if (bVar.f80235c == q.Center) {
                        GestaltIconButton gestaltIconButton = gestaltSheetHeader.f49585b;
                        if (gestaltIconButton == null) {
                            Intrinsics.r("startIconButton");
                            throw null;
                        }
                        com.bumptech.glide.c.n0(gestaltIconButton);
                    } else {
                        GestaltIconButton gestaltIconButton2 = gestaltSheetHeader.f49585b;
                        if (gestaltIconButton2 == null) {
                            Intrinsics.r("startIconButton");
                            throw null;
                        }
                        com.bumptech.glide.c.d0(gestaltIconButton2);
                        gestaltSheetHeader.g0(eo1.a.space_400);
                    }
                } else {
                    int i14 = c.f80245b[pVar.ordinal()];
                    if (i14 == 1 || i14 == 2) {
                        rm1.q qVar3 = rm1.q.CANCEL;
                        int i15 = w.sheet_dismiss_action;
                        String[] formatArgs = new String[0];
                        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                        pair = new Pair(qVar3, new k0(i15, new ArrayList(0)));
                    } else {
                        if (i14 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        rm1.q qVar4 = rm1.q.DIRECTIONAL_ARROW_LEFT;
                        int i16 = w.sheet_previous_page;
                        String[] formatArgs2 = new String[0];
                        Intrinsics.checkNotNullParameter(formatArgs2, "formatArgs");
                        pair = new Pair(qVar4, new k0(i16, new ArrayList(0)));
                    }
                    rm1.q qVar5 = (rm1.q) pair.f80346a;
                    k0 k0Var = (k0) pair.f80347b;
                    GestaltIconButton gestaltIconButton3 = gestaltSheetHeader.f49585b;
                    if (gestaltIconButton3 == null) {
                        Intrinsics.r("startIconButton");
                        throw null;
                    }
                    g3.y(gestaltIconButton3, new k(6, qVar5, k0Var));
                    gestaltSheetHeader.g0(eo1.a.space_100);
                }
                return Unit.f80348a;
        }
    }
}
