package n62;

import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.widget.c2;
import ao2.j0;
import com.google.android.gms.ads.AdSize;
import java.util.concurrent.CompletableFuture;
import kh2.c3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.z;
import r72.l2;

/* loaded from: classes4.dex */
public final class j extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f89368r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c2 f89369s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l2 f89370t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ s62.b f89371u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(c2 c2Var, l2 l2Var, s62.b bVar, bl2.c cVar) {
        super(2, cVar);
        this.f89369s = c2Var;
        this.f89370t = l2Var;
        this.f89371u = bVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new j(this.f89369s, this.f89370t, this.f89371u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f89368r;
        c2 c2Var = this.f89369s;
        if (i13 == 0) {
            ue.c.H(obj);
            CompletableFuture j13 = ((x72.j) c2Var.f16534e).j();
            this.f89368r = 1;
            if (c3.q(j13, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        ke2.d dVar = (ke2.d) CollectionsKt.firstOrNull(((x72.j) c2Var.f16534e).f().f79314f);
        if (dVar != null) {
            boolean j14 = z.j(this.f89370t.f106540a);
            s62.b bVar = this.f89371u;
            if (j14) {
                int i14 = com.pinterest.shuffles.scene.composer.z.f52181a;
                int width = ((x72.j) c2Var.f16534e).a().getWidth();
                int i15 = (width - ((width / 375) * AdSize.MEDIUM_RECTANGLE_WIDTH)) / 2;
                EditText editText = ((y90.c) bVar).f138137b;
                ViewGroup.LayoutParams layoutParams = editText.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int i16 = i15 / 2;
                marginLayoutParams.leftMargin = i16;
                marginLayoutParams.rightMargin = i16;
                editText.setLayoutParams(marginLayoutParams);
            } else {
                int width2 = (((x72.j) c2Var.f16534e).a().getWidth() - ((int) dVar.f79319a.b())) / 2;
                EditText editText2 = ((y90.c) bVar).f138137b;
                ViewGroup.LayoutParams layoutParams2 = editText2.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.setMarginStart(width2);
                marginLayoutParams2.setMarginEnd(width2);
                editText2.setLayoutParams(marginLayoutParams2);
            }
        }
        return Unit.f80348a;
    }
}
