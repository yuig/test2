package fk0;

import com.pinterest.gestalt.sheet.header.GestaltSheetHeader;
import com.pinterest.navigation.Navigation;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import u50.h0;
import u50.k0;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final i f62282j = new i(0);

    /* renamed from: k, reason: collision with root package name */
    public static final i f62283k = new i(1);

    /* renamed from: l, reason: collision with root package name */
    public static final i f62284l = new i(2);

    /* renamed from: m, reason: collision with root package name */
    public static final i f62285m = new i(3);

    /* renamed from: n, reason: collision with root package name */
    public static final i f62286n = new i(4);

    /* renamed from: o, reason: collision with root package name */
    public static final i f62287o = new i(5);

    /* renamed from: p, reason: collision with root package name */
    public static final i f62288p = new i(6);

    /* renamed from: q, reason: collision with root package name */
    public static final i f62289q = new i(7);

    /* renamed from: r, reason: collision with root package name */
    public static final i f62290r = new i(8);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62291i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i13) {
        super(1);
        this.f62291i = i13;
    }

    public final void b(ao1.i bind) {
        switch (this.f62291i) {
            case 0:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.e(yn1.f.DEFAULT);
                h0 helperText = h0.f120562a;
                Intrinsics.checkNotNullParameter(helperText, "helperText");
                bind.f20086c = helperText;
                break;
            case 1:
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f20093j = 50;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.getClass();
                bind.f20097n = fm1.c.VISIBLE;
                break;
        }
    }

    public final void e(yl1.l bind) {
        switch (this.f62291i) {
            case 1:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.c(x0.next);
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.c(x0.create_new_board_dialog_create);
                bind.f139349b = true;
                bind.e(fm1.c.VISIBLE);
                bind.f139356i = x60.c.create_board_button_id;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f62291i) {
            case 0:
                b((ao1.i) obj);
                return Unit.f80348a;
            case 1:
                e((yl1.l) obj);
                return Unit.f80348a;
            case 2:
                b((ao1.i) obj);
                return Unit.f80348a;
            case 3:
                b((ao1.i) obj);
                return Unit.f80348a;
            case 4:
                e((yl1.l) obj);
                return Unit.f80348a;
            case 5:
                kn1.b it = (kn1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                hn1.p pVar = hn1.p.NONE;
                int i13 = x60.e.new_board;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                return kn1.b.e(it, false, false, GestaltSheetHeader.f49579n, new k0(i13, new ArrayList(0)), pVar, null, null, 1939);
            case 6:
                yl1.b it2 = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return yl1.b.f(it2, null, false, null, null, null, null, null, null, 0, null, 1021);
            case 7:
                ao1.b it3 = (ao1.b) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return ao1.b.e(it3, null, null, null, null, null, false, 0, 0, 50, true, false, false, null, false, null, null, null, null, null, 0, 4192767);
            default:
                Navigation navigateToBoard = (Navigation) obj;
                Intrinsics.checkNotNullParameter(navigateToBoard, "$this$navigateToBoard");
                navigateToBoard.m0("com.pinterest.EXTRA_BOARD_VIEW_ENTRY_TYPE", "toast");
                return Unit.f80348a;
        }
    }
}
