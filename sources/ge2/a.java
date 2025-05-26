package ge2;

import androidx.camera.core.impl.j;
import com.pinterest.xrenderer.legacy.stickers.base.Constants;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import q8.d;
import rd2.f;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final bn0.a f64840a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f64841b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f64842c;

    /* renamed from: d, reason: collision with root package name */
    public final b f64843d;

    /* renamed from: e, reason: collision with root package name */
    public final d f64844e;

    /* renamed from: f, reason: collision with root package name */
    public final he.b f64845f;

    /* renamed from: g, reason: collision with root package name */
    public final he.b f64846g;

    /* renamed from: h, reason: collision with root package name */
    public final j f64847h;

    public a(fe2.b parent, t72.j gl3) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(gl3, "gl");
        Constants constants = Constants.INSTANCE;
        ud2.c cVar = (ud2.c) parent.f58823h.c(parent, ee2.d.f58814i[0]);
        gd2.c cVar2 = parent.f58821f;
        f fVar = new f(constants, cVar2, parent.f58822g, cVar);
        bn0.a aVar = new bn0.a(fVar.e("#version 300 es\n{{#embedCommon}}\n{{/embedCommon}}\n\n\nlayout (location = {{constants.ATTR_VERTEX_COORD_LOCATION}}) in vec3 a_vertexCoord;\nlayout (location = {{constants.ATTR_TEXTURE_COORD_LOCATION}}) in vec2 a_textureCoord;\n\nout vec3 v_vertexCoord;\nout vec2 v_textureCoord;\n\nuniform vec2 {{constants.UNIFORM_SIZE_NAME}};\nuniform mat4 {{constants.UNIFORM_MVP_NAME}};\nuniform float {{constants.UNIFORM_TIME_NAME}};\n\n{{#embedEffectsDefinition}}\n{{/embedEffectsDefinition}}\n\nvoid main() {\n    VertexEffectInput distortionData;\n    distortionData.position = a_vertexCoord;\n    distortionData.texturePosition = a_textureCoord;\n    distortionData.time = {{constants.UNIFORM_TIME_NAME}};\n    distortionData.size = {{constants.UNIFORM_SIZE_NAME}};\n\n    v_vertexCoord = distortionEffectCombined(distortionData);\n    v_textureCoord = a_textureCoord;\n\n    gl_Position = {{constants.UNIFORM_MVP_NAME}} * vec4(v_vertexCoord, 1.0);\n}"), fVar.a("#version 300 es\n{{#embedCommon}}\n{{/embedCommon}}\n\n\nin vec3 v_vertexCoord;\nin vec2 v_textureCoord;\n\nlayout (location = 0) out vec4 fragColor;\nlayout (location = 1) out vec4 fragIndex;\n\nuniform vec2 {{constants.UNIFORM_SIZE_NAME}};\nuniform float {{constants.UNIFORM_TIME_NAME}};\nuniform float {{constants.UNIFORM_OPACITY_NAME}};\nuniform int {{constants.UNIFORM_ITEM_ID_NAME}};\nuniform bool {{constants.UNIFORM_HIT_TESTING_ENABLED}};\nuniform sampler2D {{constants.UNIFORM_SOURCE_TEXTURE_SAMPLER}};\n\n{{#embedEffectsDefinition}}\n{{/embedEffectsDefinition}}\n\nvoid main() {\n    vec4 color = texture(\n        {{constants.UNIFORM_SOURCE_TEXTURE_SAMPLER}},\n        v_textureCoord\n    );\n\n    ////////////////////////////////////////////////////\n    {{#kernelEffectDefinition}}\n    FragmentEffectInput kernelInput;\n    kernelInput.color = color;\n    kernelInput.position = v_vertexCoord;\n    kernelInput.texturePosition = v_textureCoord;\n    kernelInput.time = {{constants.UNIFORM_TIME_NAME}};\n    kernelInput.itemID = {{constants.UNIFORM_ITEM_ID_NAME}};\n\n    color = {{name}}(kernelInput, {{constants.UNIFORM_SOURCE_TEXTURE_SAMPLER}});\n    {{/kernelEffectDefinition}}\n    ////////////////////////////////////////////////////\n\n    FragmentEffectInput colorInput;\n    colorInput.color = color;\n    colorInput.position = v_vertexCoord;\n    colorInput.texturePosition = v_textureCoord;\n    colorInput.time = {{constants.UNIFORM_TIME_NAME}};\n    colorInput.itemID = {{constants.UNIFORM_ITEM_ID_NAME}};\n\n    color = colorEffectCombined(colorInput);\n    ////////////////////////////////////////////////////\n\n    fragColor = color;\n    fragColor.a *= {{constants.UNIFORM_OPACITY_NAME}};\n\n    if ({{constants.UNIFORM_HIT_TESTING_ENABLED}} && fragColor.a > 1.0/255.0) {\n        fragIndex = encodeItemID({{constants.UNIFORM_ITEM_ID_NAME}});\n    } else {\n        // set index alpha to zero if current pixel isn't quite visible\n        // so that the result of this pixel is skipped at blending stage\n        // and the index texture isn't affected\n        fragIndex.a = 0.0;\n    }\n}"));
        this.f64840a = aVar;
        this.f64841b = fVar.c(aVar);
        this.f64842c = fVar.d(aVar);
        this.f64843d = new b(aVar);
        int i13 = cVar2.isEmpty() ? 1 : 50;
        d dVar = new d(i13, i13);
        this.f64844e = dVar;
        this.f64845f = new he.b(3, dVar.b());
        this.f64846g = new he.b(2, dVar.a());
        this.f64847h = new j(gl3, parent.f58820e);
    }
}
