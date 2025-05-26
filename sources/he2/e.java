package he2;

import android.graphics.PointF;
import android.opengl.GLES20;
import android.util.Size;
import android.util.SizeF;
import cd2.n;
import com.pinterest.xrenderer.legacy.postprocessing.Constants;
import dv0.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kv0.p;
import pd2.a0;
import pd2.i0;
import pd2.l0;
import pd2.o0;
import pd2.p0;
import pd2.x;
import rl2.u;
import v.z1;

/* loaded from: classes4.dex */
public final class e extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f68972i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f68973j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f68974k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, float f13, int i13) {
        super(0);
        this.f68972i = i13;
        this.f68973j = fVar;
        this.f68974k = f13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f68972i) {
            case 0:
                m148invoke();
                break;
            case 1:
                m148invoke();
                break;
            default:
                m148invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m148invoke() {
        int i13 = this.f68972i;
        String str = "block";
        String str2 = "tag";
        String str3 = "";
        int i14 = 2;
        float f13 = this.f68974k;
        f fVar = this.f68973j;
        int i15 = 1;
        switch (i13) {
            case 0:
                q qVar = fVar.f68987o;
                qVar.getClass();
                nd2.a block = new nd2.a(qVar, 11);
                Intrinsics.checkNotNullParameter("", "tag");
                Intrinsics.checkNotNullParameter(block, "block");
                Intrinsics.checkNotNullParameter("", "tag");
                Intrinsics.checkNotNullParameter(block, "block");
                block.invoke();
                c block2 = new c(fVar, 0);
                Intrinsics.checkNotNullParameter("", "tag");
                Intrinsics.checkNotNullParameter(block2, "block");
                Intrinsics.checkNotNullParameter("", "tag");
                Intrinsics.checkNotNullParameter(block2, "block");
                block2.invoke();
                e block3 = new e(fVar, f13, i14);
                Intrinsics.checkNotNullParameter("", "tag");
                Intrinsics.checkNotNullParameter(block3, "block");
                Intrinsics.checkNotNullParameter("", "tag");
                Intrinsics.checkNotNullParameter(block3, "block");
                block3.invoke();
                e block4 = new e(fVar, f13, i15);
                Intrinsics.checkNotNullParameter("", "tag");
                Intrinsics.checkNotNullParameter(block4, "block");
                Intrinsics.checkNotNullParameter("", "tag");
                Intrinsics.checkNotNullParameter(block4, "block");
                block4.invoke();
                c block5 = new c(fVar, 6);
                Intrinsics.checkNotNullParameter("", "tag");
                Intrinsics.checkNotNullParameter(block5, "block");
                Intrinsics.checkNotNullParameter("", "tag");
                Intrinsics.checkNotNullParameter(block5, "block");
                block5.invoke();
                return;
            case 1:
                ce2.b bVar = fVar.f68982j;
                if (bVar != null) {
                    q qVar2 = fVar.f68987o;
                    if (!Intrinsics.d(bVar.f27623c, (List) ((p) qVar2.f56383d).f80996c)) {
                        ce2.b bVar2 = fVar.f68982j;
                        if (bVar2 != null) {
                            gd2.c cVar = bVar2.f27623c;
                            cVar.clear();
                            cVar.addAll((List) ((p) qVar2.f56383d).f80996c);
                        } else {
                            Intrinsics.r("postProcessing");
                            throw null;
                        }
                    }
                    yd2.j jVar = fVar.f68977e;
                    if (jVar != null) {
                        ae2.d dVar = fVar.f68980h;
                        if (dVar != null) {
                            jVar.b(new yd2.c(dVar));
                            jVar.a();
                            GLES20.glDisable(3042);
                            ce2.b bVar3 = fVar.f68982j;
                            if (bVar3 != null) {
                                if (bVar3.f27621a != null) {
                                    if (bVar3.f27622b != null) {
                                        if (!bVar3.f27625e) {
                                            rd2.f fVar2 = new rd2.f(Constants.INSTANCE, q0.f80391a, bVar3.f27623c, (ud2.c) bVar3.f27624d.c(bVar3, ce2.b.f27620m[0]));
                                            bn0.a aVar = new bn0.a(fVar2.e("#version 300 es\n{{#embedCommon}}\n{{/embedCommon}}\n\n\nlayout (location = {{constants.ATTR_VERTEX_COORD_LOCATION}}) in vec3 a_vertexCoord;\nlayout (location = {{constants.ATTR_TEXTURE_COORD_LOCATION}}) in vec2 a_textureCoord;\n\nout vec3 v_vertexCoord;\nout vec2 v_textureCoord;\n\nvoid main() {\n    v_vertexCoord = a_vertexCoord;\n    v_textureCoord = a_textureCoord;\n\n    gl_Position = vec4(v_vertexCoord, 1.0);\n    gl_Position.y *= -1.0;\n}"), fVar2.a("#version 300 es\n{{#embedCommon}}\n{{/embedCommon}}\n\n\nin vec3 v_vertexCoord;\nin vec2 v_textureCoord;\n\nlayout (location = 0) out vec4 fragColor;\n\nuniform float {{constants.UNIFORM_TIME_NAME}};\nuniform sampler2D {{constants.UNIFORM_SOURCE_TEXTURE_SAMPLER}};\nuniform sampler2D {{constants.UNIFORM_INDEX_TEXTURE_SAMPLER}};\n\n{{#embedEffectsDefinition}}\n{{/embedEffectsDefinition}}\n\nvoid main() {\n    vec4 rawItemID = texture(\n        {{constants.UNIFORM_INDEX_TEXTURE_SAMPLER}},\n        v_textureCoord\n    );\n    int itemID = decodeItemID(rawItemID);\n\n    vec4 color = texture(\n        {{constants.UNIFORM_SOURCE_TEXTURE_SAMPLER}},\n        v_textureCoord\n    );\n\n    ////////////////////////////////////////////////////\n    {{#kernelEffectDefinition}}\n    FragmentEffectInput kernelInput;\n    kernelInput.color = color;\n    kernelInput.position = v_vertexCoord;\n    kernelInput.texturePosition = v_textureCoord;\n    kernelInput.time = {{constants.UNIFORM_TIME_NAME}};\n    kernelInput.itemID = {{constants.UNIFORM_ITEM_ID_NAME}};\n\n    color = {{name}}(kernelInput, {{constants.UNIFORM_SOURCE_TEXTURE_SAMPLER}});\n    {{/kernelEffectDefinition}}\n    ////////////////////////////////////////////////////\n\n    FragmentEffectInput colorInput;\n    colorInput.color = color;\n    colorInput.position = v_vertexCoord;\n    colorInput.time = {{constants.UNIFORM_TIME_NAME}};\n    colorInput.itemID = itemID;\n\n    fragColor = colorEffectCombined(colorInput);\n}"));
                                            bVar3.f27630j = fVar2.c(aVar);
                                            bVar3.f27631k = fVar2.d(aVar);
                                            bVar3.f27632l = new ce2.a(aVar);
                                            bVar3.f27629i = aVar;
                                            bVar3.f27625e = true;
                                        }
                                        bn0.a aVar2 = bVar3.f27629i;
                                        Intrinsics.f(aVar2);
                                        aVar2.a();
                                        bVar3.f27627g.a(0);
                                        bVar3.f27628h.a(1);
                                        ae2.d dVar2 = bVar3.f27621a;
                                        Intrinsics.f(dVar2);
                                        dVar2.f15064c = 0;
                                        dVar2.a();
                                        ae2.d dVar3 = bVar3.f27622b;
                                        Intrinsics.f(dVar3);
                                        dVar3.f15064c = 1;
                                        dVar3.a();
                                        ArrayList arrayList = bVar3.f27631k;
                                        if (arrayList != null) {
                                            int i16 = 0;
                                            for (Object obj : arrayList) {
                                                int i17 = i16 + 1;
                                                if (i16 >= 0) {
                                                    ae2.f fVar3 = ((rd2.d) obj).f107520a;
                                                    fVar3.f15064c = i16 + 2;
                                                    fVar3.a();
                                                    i16 = i17;
                                                } else {
                                                    f0.p();
                                                    throw null;
                                                }
                                            }
                                            ce2.a aVar3 = bVar3.f27632l;
                                            if (aVar3 != null) {
                                                aVar3.f27617a.h(ce2.a.f27616d[0]).f(f13);
                                                ArrayList<rd2.c> arrayList2 = bVar3.f27630j;
                                                if (arrayList2 != null) {
                                                    for (rd2.c cVar2 : arrayList2) {
                                                        p0 d2 = cVar2.f107517a.f121933c.d(cVar2.f107519c);
                                                        boolean z13 = d2 instanceof i0;
                                                        androidx.appcompat.widget.a aVar4 = cVar2.f107518b;
                                                        if (z13) {
                                                            aVar4.i(((i0) d2).f99845b);
                                                        } else if (d2 instanceof pd2.f0) {
                                                            aVar4.f(((pd2.f0) d2).f99839b);
                                                        } else if (d2 instanceof a0) {
                                                            aVar4.e(((a0) d2).f99825b);
                                                        } else if (d2 instanceof x) {
                                                            aVar4.c(((x) d2).f99879b);
                                                        } else if (d2 instanceof o0) {
                                                            PointF pointF = ((o0) d2).f99863b;
                                                            aVar4.g(pointF.x, pointF.y);
                                                        } else if (d2 instanceof l0) {
                                                            hd2.f fVar4 = ((l0) d2).f99854b;
                                                            PointF pointF2 = fVar4.f68922a;
                                                            float f14 = pointF2.x;
                                                            float f15 = pointF2.y;
                                                            PointF pointF3 = fVar4.f68923b;
                                                            aVar4.h(f14, f15, pointF3.x, pointF3.y);
                                                        }
                                                    }
                                                    ce2.a aVar5 = bVar3.f27632l;
                                                    if (aVar5 != null) {
                                                        u[] uVarArr = ce2.a.f27616d;
                                                        androidx.appcompat.widget.a h10 = aVar5.f27618b.h(uVarArr[1]);
                                                        ae2.d dVar4 = bVar3.f27621a;
                                                        Intrinsics.f(dVar4);
                                                        h10.j(dVar4);
                                                        ce2.a aVar6 = bVar3.f27632l;
                                                        if (aVar6 != null) {
                                                            androidx.appcompat.widget.a h13 = aVar6.f27619c.h(uVarArr[2]);
                                                            ae2.d dVar5 = bVar3.f27622b;
                                                            Intrinsics.f(dVar5);
                                                            h13.j(dVar5);
                                                            ArrayList<rd2.d> arrayList3 = bVar3.f27631k;
                                                            if (arrayList3 != null) {
                                                                for (rd2.d dVar6 : arrayList3) {
                                                                    dVar6.f107521b.j(dVar6.f107520a);
                                                                }
                                                                GLES20.glDrawArrays(4, 0, bVar3.f27626f.f102897c);
                                                                return;
                                                            }
                                                            Intrinsics.r("texturesBindings");
                                                            throw null;
                                                        }
                                                        Intrinsics.r("uniforms");
                                                        throw null;
                                                    }
                                                    Intrinsics.r("uniforms");
                                                    throw null;
                                                }
                                                Intrinsics.r("settingsBindings");
                                                throw null;
                                            }
                                            Intrinsics.r("uniforms");
                                            throw null;
                                        }
                                        Intrinsics.r("texturesBindings");
                                        throw null;
                                    }
                                    throw new IllegalStateException("can't render post-processing w/o indexTexture set".toString());
                                }
                                throw new IllegalStateException("can't render post-processing w/o colorTexture set".toString());
                            }
                            Intrinsics.r("postProcessing");
                            throw null;
                        }
                        Intrinsics.r("postProcessingTexture");
                        throw null;
                    }
                    Intrinsics.r("frameBuffer");
                    throw null;
                }
                Intrinsics.r("postProcessing");
                throw null;
            default:
                yd2.j jVar2 = fVar.f68977e;
                if (jVar2 != null) {
                    ae2.d dVar7 = fVar.f68978f;
                    if (dVar7 != null) {
                        ae2.d[] dVarArr = new ae2.d[1];
                        ae2.d dVar8 = fVar.f68979g;
                        if (dVar8 != null) {
                            dVarArr[0] = dVar8;
                            jVar2.b(new yd2.c(dVar7, dVarArr));
                            jVar2.a();
                            GLES20.glEnable(3042);
                            GLES20.glBlendFunc(1, 771);
                            Iterator it = CollectionsKt.x0((List) ((p) fVar.f68987o.f56383d).f80994a, new sw0.u(16)).iterator();
                            while (it.hasNext()) {
                                ee2.e eVar = (ee2.e) it.next();
                                Size viewSize = fVar.f54675a;
                                eVar.getClass();
                                Intrinsics.checkNotNullParameter(viewSize, "viewSize");
                                fe2.b bVar4 = eVar.f58824a;
                                bVar4.getClass();
                                SizeF sizeF = new SizeF(bVar4.f62088n, bVar4.f62089o);
                                Iterator it2 = it;
                                hd2.a fov = new hd2.a(45.0d / 360);
                                float height = (float) ((viewSize.getHeight() * 0.5d) / Math.tan(fov.a() * 0.5d));
                                z1 z1Var = new z1(9);
                                String str4 = str;
                                z1Var.b(new hd2.h(sizeF.getWidth() * 0.5f * eVar.f58825b.f79308e, sizeF.getHeight() * 0.5f * eVar.f58825b.f79308e, (sizeF.getHeight() + sizeF.getWidth()) * 0.25f * eVar.f58825b.f79308e, 0));
                                ke2.a aVar7 = eVar.f58825b.f79307d;
                                String str5 = str2;
                                hd2.a angle = new hd2.a(aVar7.f79302a * 0.5d);
                                Intrinsics.checkNotNullParameter(angle, "angle");
                                z1Var.b(new hd2.g(angle, 0.0f, 1.0f, 0.0f, 1));
                                String str6 = str3;
                                hd2.a angle2 = new hd2.a(aVar7.f79303b * 0.5d);
                                Intrinsics.checkNotNullParameter(angle2, "angle");
                                z1Var.b(new hd2.g(angle2, 1.0f, 0.0f, 0.0f, 1));
                                hd2.a angle3 = eVar.f58825b.f79306c;
                                Intrinsics.checkNotNullParameter(angle3, "angle");
                                z1Var.b(new n(angle3, 3));
                                z1.x(z1Var, eVar.f58825b.f79304a.x - (viewSize.getWidth() * 0.5f), (viewSize.getHeight() * 0.5f) - eVar.f58825b.f79304a.y, 0.0f, 4);
                                z1.x(z1Var, 0.0f, 0.0f, -height, 3);
                                Intrinsics.checkNotNullParameter(viewSize, "<this>");
                                float width = viewSize.getHeight() > 0 ? (viewSize.getWidth() * 1.0f) / viewSize.getHeight() : 0.0f;
                                Intrinsics.checkNotNullParameter(fov, "fov");
                                z1Var.b(new hd2.g(fov, width, 0.01f, height * 100.0f, 0));
                                ee2.a drawSettings = new ee2.a(viewSize, z1Var, f13);
                                t72.j gl3 = fVar.f68981i;
                                Intrinsics.checkNotNullParameter(gl3, "gl");
                                Intrinsics.checkNotNullParameter(drawSettings, "drawSettings");
                                px0.g gVar = new px0.g(gl3, bVar4, drawSettings, 29);
                                Intrinsics.checkNotNullParameter(str6, str5);
                                Intrinsics.checkNotNullParameter(gVar, str4);
                                Intrinsics.checkNotNullParameter(str6, str5);
                                Intrinsics.checkNotNullParameter(gVar, str4);
                                gVar.invoke();
                                str3 = str6;
                                str = str4;
                                str2 = str5;
                                it = it2;
                            }
                            return;
                        }
                        Intrinsics.r("indexTexture");
                        throw null;
                    }
                    Intrinsics.r("colorTexture");
                    throw null;
                }
                Intrinsics.r("frameBuffer");
                throw null;
        }
    }
}
