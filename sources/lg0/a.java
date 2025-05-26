package lg0;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.engage.common.datamodel.EngagementCluster;
import com.google.android.engage.common.datamodel.Image;
import com.google.android.engage.common.datamodel.RecommendationCluster;
import com.google.android.engage.common.datamodel.SignInCardEntity;
import com.google.android.engage.service.ClusterList;
import com.google.android.engage.social.datamodel.PortraitMediaPost;
import com.google.common.util.concurrent.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import pk.v2;
import rd.j;
import s30.k;
import s30.l;
import sp2.i;

/* loaded from: classes5.dex */
public abstract class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(j jVar, o publishRequest) {
        Integer num;
        Integer num2;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(publishRequest, "publishRequest");
        if (Intrinsics.d(publishRequest, b.f83206b)) {
            jVar.getClass();
            xg.a aVar = new xg.a(0);
            aVar.f134906a.e(1);
            jVar.g(new xg.b(aVar));
            xg.a aVar2 = new xg.a(0);
            aVar2.f134906a.e(8);
            jVar.g(new xg.b(aVar2));
            b(jVar, 4);
            return;
        }
        if (!(publishRequest instanceof c)) {
            if (publishRequest instanceof d) {
                d dVar = (d) publishRequest;
                com.google.android.engage.common.datamodel.b bVar = new com.google.android.engage.common.datamodel.b();
                Image.Builder builder = new Image.Builder();
                g gVar = dVar.f83208b;
                SignInCardEntity build = ((com.google.android.engage.common.datamodel.b) ((com.google.android.engage.common.datamodel.b) ((com.google.android.engage.common.datamodel.b) ((com.google.android.engage.common.datamodel.b) ((com.google.android.engage.common.datamodel.b) bVar.addPosterImage(builder.setImageUri(Uri.parse(gVar.f83216a)).setImageWidthInPixel(gVar.f83217b).setImageHeightInPixel(gVar.f83218c).build())).setTitle(dVar.f83209c)).setSubtitle(dVar.f83210d)).setActionText(dVar.f83211e)).setActionUri(Uri.parse(dVar.f83212f))).build();
                Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                com.google.android.engage.common.datamodel.d dVar2 = new com.google.android.engage.common.datamodel.d();
                dVar2.a(build);
                EngagementCluster build2 = dVar2.build();
                xg.e eVar = (xg.e) jVar.f107506b;
                xg.f fVar = new xg.f();
                fVar.f134918a.e(build2);
                eVar.a(new ClusterList(fVar)).onSuccessTask(r.INSTANCE, yg.b.f139005a);
                xg.a aVar3 = new xg.a(0);
                aVar3.f134906a.e(1);
                jVar.g(new xg.b(aVar3));
                b(jVar, 1);
                return;
            }
            return;
        }
        List list = ((c) publishRequest).f83207b;
        if (!list.isEmpty()) {
            xg.a aVar4 = new xg.a(1);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                List list2 = ((l) obj).f111041b;
                if (list2 != null && list2.size() >= 5) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                l lVar = (l) it.next();
                com.google.android.engage.common.datamodel.a aVar5 = new com.google.android.engage.common.datamodel.a();
                aVar5.f30276b = Uri.parse(lVar.f111040a);
                String str = lVar.f111042c;
                if (str == null) {
                    str = "";
                }
                aVar5.f30275a = str;
                List<k> list3 = lVar.f111041b;
                if (list3 != null) {
                    for (k kVar : list3) {
                        s30.j jVar2 = kVar.f111039b;
                        int intValue = (jVar2 == null || (num2 = jVar2.f111035a) == null) ? 0 : num2.intValue();
                        s30.j jVar3 = kVar.f111039b;
                        int intValue2 = (jVar3 == null || (num = jVar3.f111037c) == null) ? 0 : num.intValue();
                        com.google.android.engage.social.datamodel.a aVar6 = new com.google.android.engage.social.datamodel.a();
                        aVar6.f30318a = Uri.parse(kVar.f111038a);
                        aVar6.f30317c = new PortraitMediaPost.Builder().addVisualContent(new Image.Builder().setImageUri(Uri.parse(jVar3 != null ? jVar3.f111036b : null)).setImageHeightInPixel(intValue).setImageWidthInPixel(intValue2).build()).build();
                        aVar5.addEntity(aVar6.build());
                    }
                }
                RecommendationCluster build3 = aVar5.build();
                Intrinsics.checkNotNullExpressionValue(build3, "build(...)");
                aVar4.f134906a.e(build3);
            }
            xg.b bVar2 = new xg.b(aVar4, 0);
            Intrinsics.checkNotNullExpressionValue(bVar2, "build(...)");
            xg.e eVar2 = (xg.e) jVar.f107506b;
            xg.f fVar2 = new xg.f();
            v2 v2Var = bVar2.f134907a;
            int i13 = v2Var.f100504d;
            for (int i14 = 0; i14 < i13; i14++) {
                fVar2.f134918a.e((RecommendationCluster) v2Var.get(i14));
            }
            eVar2.a(new ClusterList(fVar2)).onSuccessTask(r.INSTANCE, yg.c.f139006a);
            xg.a aVar7 = new xg.a(0);
            aVar7.f134906a.e(8);
            jVar.g(new xg.b(aVar7));
            b(jVar, 0);
        }
    }

    public static final void b(j jVar, int i13) {
        xg.e eVar = (xg.e) jVar.f107506b;
        eVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("engage_sdk_version", eVar.f134916c);
        bundle.putString("calling_package_name", eVar.f134915b);
        bundle.putInt("publish_status_code", i13);
        eVar.b(new i(29, eVar, bundle)).onSuccessTask(r.INSTANCE, yg.a.f139004a);
    }
}
