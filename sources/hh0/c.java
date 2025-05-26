package hh0;

import com.pinterest.experience.models.framework.ExperienceDataDeserializationException;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.y0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import xk2.q;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f69135j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f69136k = new c(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f69137i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f69137i = i13;
    }

    public final Object b(f context) {
        fh0.e eVar;
        ExperienceDataDeserializationException experienceDataDeserializationException;
        switch (this.f69137i) {
            case 0:
                Intrinsics.checkNotNullParameter(context, "$this$null");
                fh0.e[] values = fh0.e.values();
                int length = values.length;
                int i13 = 0;
                while (true) {
                    if (i13 < length) {
                        eVar = values[i13];
                        if (!((Boolean) eVar.getMatcher().invoke(context)).booleanValue()) {
                            i13++;
                        }
                    } else {
                        eVar = null;
                    }
                }
                if (eVar == null) {
                    q qVar = xk2.s.f135225b;
                    int i14 = ExperienceDataDeserializationException.f45050c;
                    Intrinsics.checkNotNullParameter(context, "context");
                    return ue.c.m(new ExperienceDataDeserializationException(context, "ERR_UNMATCHED_DESERIALIZER", (Map) null, 12));
                }
                Object obj = ((xk2.s) eVar.getDeserializer().invoke(context)).f135226a;
                Throwable cause = xk2.s.a(obj);
                if (cause == null) {
                    return obj;
                }
                int i15 = ExperienceDataDeserializationException.f45050c;
                Intrinsics.checkNotNullParameter(cause, "cause");
                if (!(cause instanceof ExperienceDataDeserializationException)) {
                    experienceDataDeserializationException = new ExperienceDataDeserializationException(context, "ERR_UNEXPECTED_EXCEPTION", y0.b(new Pair("exception", cause.getClass().getSimpleName())), cause);
                } else if (context != null) {
                    ExperienceDataDeserializationException experienceDataDeserializationException2 = (ExperienceDataDeserializationException) cause;
                    experienceDataDeserializationException = new ExperienceDataDeserializationException(context, experienceDataDeserializationException2.f45051a, experienceDataDeserializationException2.f45052b, experienceDataDeserializationException2.getCause());
                } else {
                    experienceDataDeserializationException = (ExperienceDataDeserializationException) cause;
                }
                return ue.c.m(experienceDataDeserializationException);
            default:
                Intrinsics.checkNotNullParameter(context, "$this$null");
                q qVar2 = xk2.s.f135225b;
                return d.f69138a;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.f69137i) {
        }
        return new xk2.s(b((f) obj));
    }
}
