package zn0;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.k0;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f142265j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f142266k = new c(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c f142267l = new c(2);

    /* renamed from: m, reason: collision with root package name */
    public static final c f142268m = new c(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f142269i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f142269i = i13;
    }

    public final ao1.b b(ao1.b it) {
        switch (this.f142269i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, null, null, ep.b.x("", "string", ""), null, yn1.f.DEFAULT, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194267);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                yn1.f fVar = yn1.f.ERROR;
                int i13 = k70.e.board_section_name_max_length_error;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                return ao1.b.e(it, null, null, new k0(i13, new ArrayList(0)), null, fVar, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194267);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                yn1.f fVar2 = yn1.f.ERROR;
                int i14 = k70.e.invalid_section_name_letter_number_special_char;
                String[] formatArgs2 = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs2, "formatArgs");
                return ao1.b.e(it, null, null, new k0(i14, new ArrayList(0)), null, fVar2, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194267);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f142269i) {
            case 0:
                return b((ao1.b) obj);
            case 1:
                return b((ao1.b) obj);
            case 2:
                return b((ao1.b) obj);
            default:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                int i13 = k70.e.done;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                return yl1.b.f(it, new k0(i13, new ArrayList(0)), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }
}
