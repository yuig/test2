package wk0;

import com.pinterest.api.model.ba;
import com.pinterest.api.model.lh0;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import dl0.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.f0;
import tb0.p;
import vb0.j;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f130102i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f130103j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, int i13) {
        super(1);
        this.f130102i = i13;
        this.f130103j = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        vk0.b bVar;
        int i13 = this.f130102i;
        c cVar = this.f130103j;
        switch (i13) {
            case 0:
                v7 v7Var = (v7) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.f(v7Var);
                        cVar.p3(new vk0.b(v7Var));
                        break;
                    default:
                        Intrinsics.f(v7Var);
                        cVar.p3(new vk0.b(v7Var));
                        break;
                }
                break;
            case 1:
                cVar.f130111e.q((Throwable) obj, "BoardHeaderPresenter exception in loadBoard()", p.BOARD_AND_SECTION_VIEW);
                break;
            case 2:
                ba section = (ba) obj;
                Intrinsics.f(section);
                cVar.getClass();
                Intrinsics.checkNotNullParameter(section, "section");
                cVar.f130110d.getClass();
                v7 u13 = section.u();
                if (u13 != null) {
                    if (cVar.f130107a.equals(u13.getUid()) && (bVar = cVar.f130113g) != null) {
                        String boardDescription = bVar.f126080c;
                        String boardId = bVar.f126078a;
                        Intrinsics.checkNotNullParameter(boardId, "boardId");
                        String boardName = bVar.f126079b;
                        Intrinsics.checkNotNullParameter(boardName, "boardName");
                        if (boardDescription == null) {
                            boardDescription = "";
                        }
                        Intrinsics.checkNotNullParameter(boardDescription, "boardDescription");
                        String str = bVar.f126081d;
                        boolean z13 = bVar.f126082e;
                        int i14 = bVar.f126083f;
                        int i15 = bVar.f126084g;
                        boolean z14 = bVar.f126085h;
                        boolean z15 = bVar.f126086i;
                        boolean z16 = bVar.f126087j;
                        boolean z17 = bVar.f126092o;
                        e eVar = bVar.f126094q;
                        boolean z18 = bVar.f126088k;
                        boolean z19 = bVar.f126089l;
                        k32.c[] cVarArr = bVar.f126090m;
                        boolean z23 = bVar.f126091n;
                        lh0 lh0Var = bVar.f126093p;
                        String str2 = bVar.f126095r;
                        wy0 wy0Var = bVar.f126096s;
                        int i16 = i14 - 1;
                        if (i16 < 0) {
                            i16 = 0;
                        }
                        int i17 = i15 + (-section.x().intValue());
                        if (i17 < 0) {
                            i17 = 0;
                        }
                        f0 f0Var = j.f125466a;
                        f0Var.N(boardId, "BoardDetailHeaderViewModel boardId can't be null.", new Object[0]);
                        f0Var.N(boardName, "BoardDetailHeaderViewModel boardName can't be null.", new Object[0]);
                        vk0.b bVar2 = new vk0.b();
                        bVar2.f126078a = boardId;
                        bVar2.f126082e = z13;
                        bVar2.f126084g = i17;
                        bVar2.f126079b = boardName;
                        bVar2.f126085h = z14;
                        bVar2.f126086i = z15;
                        bVar2.f126087j = z16;
                        bVar2.f126083f = i16;
                        bVar2.f126080c = boardDescription;
                        bVar2.f126092o = z17;
                        bVar2.f126093p = lh0Var;
                        bVar2.f126094q = eVar;
                        bVar2.f126081d = str;
                        bVar2.f126088k = z18;
                        bVar2.f126089l = z19;
                        bVar2.f126090m = cVarArr;
                        bVar2.f126091n = z23;
                        bVar2.f126095r = str2;
                        bVar2.f126096s = wy0Var;
                        cVar.p3(bVar2);
                    }
                }
                break;
            default:
                v7 v7Var2 = (v7) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.f(v7Var2);
                        cVar.p3(new vk0.b(v7Var2));
                        break;
                    default:
                        Intrinsics.f(v7Var2);
                        cVar.p3(new vk0.b(v7Var2));
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
