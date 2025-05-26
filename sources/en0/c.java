package en0;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import es.i;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import oe.p;

/* loaded from: classes5.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static b f59644a = b.FULL_HD;

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f59645b = new LinkedHashMap();

    public static ArrayList a(b bVar, int i13) {
        ArrayList arrayList = new ArrayList();
        a aVar = new a(bVar);
        for (int i14 = 0; i14 < i13; i14++) {
            try {
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", bVar.getLongDimension(), bVar.getShortDimension());
                createVideoFormat.setInteger("color-format", 2135033992);
                createVideoFormat.setInteger("frame-rate", 30);
                int i15 = 1;
                createVideoFormat.setInteger("i-frame-interval", 1);
                createVideoFormat.setInteger("bitrate", bVar.getDefaultBitrate());
                Intrinsics.checkNotNullExpressionValue(createVideoFormat, "apply(...)");
                MediaCodec createDecoderByType = MediaCodec.createDecoderByType("video/avc");
                Intrinsics.checkNotNullExpressionValue(createDecoderByType, "createDecoderByType(...)");
                createDecoderByType.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 0);
                createDecoderByType.start();
                arrayList.add(createDecoderByType);
                f59645b.compute(aVar, new i(i15, new p(arrayList, i15)));
            } catch (Exception e13) {
                e13.toString();
            }
        }
        return arrayList;
    }
}
