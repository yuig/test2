package dn0;

import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class b extends a {
    public b() {
        this(null, 2);
    }

    public b(ByteBuffer byteBuffer, int i13) {
        super(((i13 & 2) == 0 || ((i13 & 1) != 0 ? null : byteBuffer) != null) ? "#version 310 es\n                precision mediump float; // highp here doesn't seem to matter\n    \n                in vec2 vTextureCoord;\n                out vec4 FragColor;\n                \n                uniform mediump sampler2D srcTexture;\n                \n                void main() {\n                  FragColor = texture(srcTexture, vTextureCoord);\n                }\n            " : "#version 310 es\n                #extension GL_OES_EGL_image_external_essl3 : enable\n                precision mediump float;\n\n                in vec2 vTextureCoord;\n                out vec4 FragColor;\n                \n                uniform samplerExternalOES srcTexture;\n                \n                void main() {\n                  FragColor = texture(srcTexture, vTextureCoord);\n                }\n            ");
    }
}
