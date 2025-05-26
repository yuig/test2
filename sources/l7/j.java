package l7;

import android.content.Context;
import android.os.SystemClock;
import androidx.media3.common.VideoFrameProcessingException;
import com.pinterest.api.model.d30;
import h32.f1;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81784a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f81785b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f81786c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f81787d;

    public /* synthetic */ j(long j13, Object obj, Object obj2, int i13) {
        this.f81784a = i13;
        this.f81786c = j13;
        this.f81787d = obj;
        this.f81785b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ue.l lVar;
        switch (this.f81784a) {
            case 0:
                ((k) this.f81787d).f81796g.b(VideoFrameProcessingException.a((Exception) this.f81785b));
                break;
            case 1:
                c0 c0Var = (c0) this.f81787d;
                Exception exc = (Exception) this.f81785b;
                c0Var.getClass();
                ((c0.x0) c0Var.f81749j).a(VideoFrameProcessingException.a(exc));
                break;
            case 2:
                long j13 = this.f81786c;
                String activityName = (String) this.f81787d;
                Context appContext = (Context) this.f81785b;
                String str = ue.b.f121938a;
                Intrinsics.checkNotNullParameter(activityName, "$activityName");
                ue.l lVar2 = ue.b.f121943f;
                Long l13 = lVar2 == null ? null : lVar2.f121964b;
                if (ue.b.f121943f == null) {
                    ue.b.f121943f = new ue.l(Long.valueOf(j13), null);
                    String str2 = ue.b.f121945h;
                    Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
                    ue.m.b(activityName, str2, appContext);
                } else if (l13 != null) {
                    long longValue = j13 - l13.longValue();
                    df.e0 e0Var = df.e0.f54743a;
                    if (longValue > (df.e0.b(le.v.b()) == null ? 60 : r8.f54727d) * 1000) {
                        ue.m.d(activityName, ue.b.f121943f, ue.b.f121945h);
                        String str3 = ue.b.f121945h;
                        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
                        ue.m.b(activityName, str3, appContext);
                        ue.b.f121943f = new ue.l(Long.valueOf(j13), null);
                    } else if (longValue > 1000 && (lVar = ue.b.f121943f) != null) {
                        lVar.f121966d++;
                    }
                }
                ue.l lVar3 = ue.b.f121943f;
                if (lVar3 != null) {
                    lVar3.f121964b = Long.valueOf(j13);
                }
                ue.l lVar4 = ue.b.f121943f;
                if (lVar4 != null) {
                    lVar4.a();
                    break;
                }
                break;
            case 3:
                Function1 function1 = (Function1) this.f81787d;
                tt0.k this$0 = (tt0.k) this.f81785b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                function1.invoke(Long.valueOf(SystemClock.uptimeMillis() - this.f81786c));
                this$0.h(function1);
                break;
            case 4:
                s81.b this$02 = (s81.b) this.f81787d;
                String id3 = (String) this.f81785b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(id3, "$id");
                m81.h hVar = this$02.f111886b;
                if (hVar != null) {
                    s81.p pVar = (s81.p) hVar;
                    Intrinsics.checkNotNullParameter(id3, "id");
                    Intrinsics.checkNotNullParameter(id3, "id");
                    nx.d0.v(pVar.getPinalytics(), f1.PINCODE_URL_NAVIGATE, id3, false, 12);
                    ((u81.r) ((m81.q) pVar.getView())).j9(new s81.m(pVar, this.f81786c, id3));
                    break;
                }
                break;
            case 5:
                lg1.h this$03 = (lg1.h) this.f81787d;
                d30 photoItem = (d30) this.f81785b;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(photoItem, "$photoItem");
                this$03.f83274l = false;
                long currentTimeMillis = System.currentTimeMillis();
                int i13 = this$03.f83270h;
                if (i13 > 0) {
                    this$03.f83270h = i13 - 1;
                }
                this$03.c();
                f1 f1Var = f1.STORY_PIN_IMAGE_TO_VIDEO_CONVERSION_CANCELLED;
                String e13 = photoItem.e();
                HashMap hashMap = new HashMap();
                hashMap.put("duration", String.valueOf(currentTimeMillis - this.f81786c));
                Integer num = (Integer) this$03.f83269g.get(photoItem);
                String num2 = num != null ? num.toString() : null;
                if (num2 == null) {
                    num2 = "";
                }
                hashMap.put("retry_attempt_count", num2);
                Unit unit = Unit.f80348a;
                this$03.b(f1Var, e13, hashMap);
                break;
            default:
                qg2.j jVar = (qg2.j) this.f81787d;
                boolean z13 = ((kotlin.jvm.internal.f0) this.f81785b).f80424a;
                jVar.getClass();
                long max = z13 ? Math.max(120L, this.f81786c * 2) : 120L;
                if (max <= 3600) {
                    jVar.c(max);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ j(Object obj, Object obj2, long j13, int i13) {
        this.f81784a = i13;
        this.f81787d = obj;
        this.f81785b = obj2;
        this.f81786c = j13;
    }

    public /* synthetic */ j(s81.b bVar, long j13, String str) {
        this.f81784a = 4;
        this.f81787d = bVar;
        this.f81786c = j13;
        this.f81785b = str;
    }
}
