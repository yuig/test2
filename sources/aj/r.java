package aj;

import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import nm.u;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bB\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002×\u0002R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R$\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0016\u0010\u001b\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0016\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0016\u0010%\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001eR\u0018\u0010'\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b&\u0010\u0004R\u0018\u0010)\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b(\u0010\u0004R\u0018\u0010+\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b*\u0010\u0010R\u0018\u0010-\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b,\u0010\u0010R\u0016\u00101\u001a\u00020.8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b/\u00100R*\u00103\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b2\u0010\nR\u0016\u00105\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b4\u0010\u001eR\u0018\u00109\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010<\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010>\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b=\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b?\u0010\u0004R\u0018\u0010B\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bA\u0010\u0004R\u001e\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010C8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bD\u0010ER$\u0010J\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010G8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010L\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bK\u0010\u0004R\u0018\u0010N\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bM\u0010\u0004R\u0016\u0010P\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bO\u0010\u001eR\u0018\u0010R\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bQ\u0010\u0004R\u0018\u0010T\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bS\u0010\u0004R\u0016\u0010U\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R$\u0010W\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0006j\b\u0012\u0004\u0012\u00020\u0002`\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bV\u0010\nR \u0010[\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020Y0X8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bZ\u0010IR\u0018\u0010\\\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0010R$\u0010]\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0006j\b\u0012\u0004\u0012\u00020\u0002`\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u0010\nR\u0014\u0010a\u001a\u00020^8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u0010e\u001a\u0004\u0018\u00010b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010g\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bf\u0010\u001eR\u0016\u0010i\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bh\u0010;R\u0016\u0010k\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bj\u0010;R\u0016\u0010m\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bl\u0010\u001eR\u0018\u0010p\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010r\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bq\u0010oR\u0018\u0010v\u001a\u0004\u0018\u00010s8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0016\u0010x\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bw\u0010\u001eR\u0016\u0010z\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\by\u0010\u001eR\u0016\u0010|\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b{\u0010\u001aR\u0016\u0010~\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b}\u0010;R\u0017\u0010\u0082\u0001\u001a\u00020\u007f8\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001a\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010\u0004R\u0017\u0010\u0085\u0001\u001a\u00020.8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b;\u00100R\u001a\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010\u0004R\u001c\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001a\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010\u0004R\u001a\u0010\u008f\u0001\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u008e\u0001\u00108R\u0018\u0010\u0091\u0001\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010\u0004R\u0018\u0010\u0093\u0001\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0092\u0001\u0010\u0004R\u001a\u0010\u0097\u0001\u001a\u00030\u0094\u00018\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001a\u0010\u009b\u0001\u001a\u00030\u0098\u00018\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001a\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010\u0004R\u001a\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u009e\u0001\u0010\u0004R\u0018\u0010¡\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b \u0001\u0010;R\u001a\u0010£\u0001\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¢\u0001\u0010\u0010R\u001a\u0010¥\u0001\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¤\u0001\u0010\u0010R\u0018\u0010§\u0001\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¦\u0001\u0010\u001eR\u0018\u0010©\u0001\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¨\u0001\u0010\u001eR\u001a\u0010«\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bª\u0001\u0010\u0004R\u001a\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¬\u0001\u0010oR\u001a\u0010¯\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b®\u0001\u0010\u0004R\u0018\u0010±\u0001\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b°\u0001\u0010\u0004R\u001a\u0010³\u0001\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b²\u0001\u0010oR\u001a\u0010µ\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b´\u0001\u0010\u0004R\u001a\u0010·\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¶\u0001\u0010\u0004R\u001a\u0010¹\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¸\u0001\u0010\u0004R\u001a\u0010»\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bº\u0001\u0010\u0004R\"\u0010½\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001c0X8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b¼\u0001\u0010IR\u001a\u0010¿\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¾\u0001\u0010\u0004R\u001a\u0010Á\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÀ\u0001\u0010\u0004R\u001a\u0010Ã\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÂ\u0001\u0010\u0004R\u001a\u0010Å\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÄ\u0001\u0010\u0004R\u001a\u0010Ç\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÆ\u0001\u0010\u0004R\u001b\u0010Ê\u0001\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R\u0018\u0010Ì\u0001\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bË\u0001\u0010\u0004R\u0016\u0010Î\u0001\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\bÍ\u0001\u0010;R\u0018\u0010Ð\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÏ\u0001\u0010;R\u001a\u0010Ò\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÑ\u0001\u0010\u0004R\u001a\u0010Ô\u0001\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÓ\u0001\u0010oR\u001a\u0010Ö\u0001\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÕ\u0001\u0010oR\u001a\u0010Ø\u0001\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b×\u0001\u0010oR\u001a\u0010Ú\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÙ\u0001\u0010\u0004R\u0018\u0010Þ\u0001\u001a\u00030Û\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\bÜ\u0001\u0010Ý\u0001R\u001a\u0010à\u0001\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bß\u0001\u0010\u0010R\u001a\u0010â\u0001\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bá\u0001\u0010\u0010R\u001a\u0010ä\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bã\u0001\u0010\u0004R\u001a\u0010æ\u0001\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bå\u0001\u0010\u0010R\u0018\u0010è\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bç\u0001\u0010;R\u001a\u0010ê\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bé\u0001\u0010\u0004R&\u0010ì\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0006j\b\u0012\u0004\u0012\u00020\u0002`\b8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\bë\u0001\u0010\nR\u001a\u0010î\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bí\u0001\u0010\u0004R\u001a\u0010ð\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bï\u0001\u0010\u0004R\u001a\u0010ò\u0001\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bñ\u0001\u0010\u0010R\u001a\u0010ô\u0001\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bó\u0001\u0010oR\u001a\u0010ö\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bõ\u0001\u0010\u0004R\u001a\u0010ø\u0001\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b÷\u0001\u0010oR\u001a\u0010ú\u0001\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bù\u0001\u0010oR\u001a\u0010ü\u0001\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bû\u0001\u0010oR\u001a\u0010þ\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bý\u0001\u0010\u0004R\u001a\u0010\u0080\u0002\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÿ\u0001\u0010\u0010R\u001a\u0010\u0082\u0002\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0081\u0002\u0010\u0004R\u001c\u0010\u0086\u0002\u001a\u0005\u0018\u00010\u0083\u00028\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b\u0084\u0002\u0010\u0085\u0002R\u001c\u0010\u0088\u0002\u001a\u0005\u0018\u00010\u0098\u00018\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b\u0087\u0002\u0010\u009a\u0001R\u001a\u0010\u008a\u0002\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0089\u0002\u0010oR\u001a\u0010\u008c\u0002\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u008b\u0002\u0010oR\"\u0010\u0090\u0002\u001a\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u008d\u00028\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b\u008e\u0002\u0010\u008f\u0002R\"\u0010\u0092\u0002\u001a\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u008d\u00028\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b\u0091\u0002\u0010\u008f\u0002R\u001a\u0010\u0094\u0002\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0093\u0002\u0010\u0010R\u001a\u0010\u0096\u0002\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0095\u0002\u0010\u0004R\u001a\u0010\u0098\u0002\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0097\u0002\u0010\u0010R\u001a\u0010\u009a\u0002\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0099\u0002\u0010oR\u001a\u0010\u009c\u0002\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u009b\u0002\u0010\u0010R\u001c\u0010 \u0002\u001a\u0005\u0018\u00010\u009d\u00028\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b\u009e\u0002\u0010\u009f\u0002R\u001a\u0010¢\u0002\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¡\u0002\u0010\u0010R\u001a\u0010¤\u0002\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b£\u0002\u0010oR\u001a\u0010¦\u0002\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¥\u0002\u0010oR\u001a\u0010¨\u0002\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b§\u0002\u0010\u0004R\u001a\u0010ª\u0002\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b©\u0002\u0010oR\u0018\u0010¬\u0002\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b«\u0002\u0010\u001eR\u001a\u0010®\u0002\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u00ad\u0002\u0010\u0010R\u001a\u0010°\u0002\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¯\u0002\u0010\u0010R\u001a\u0010²\u0002\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b±\u0002\u0010oR\u001a\u0010´\u0002\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b³\u0002\u0010\u0004R\u001a\u0010¶\u0002\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bµ\u0002\u0010\u0010R\u001a\u0010¸\u0002\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b·\u0002\u0010\u0004R\u001a\u0010º\u0002\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¹\u0002\u0010\u0004R\u001a\u0010¼\u0002\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b»\u0002\u0010\u0004R\u001a\u0010¾\u0002\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b½\u0002\u0010\u0010R\u001a\u0010À\u0002\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¿\u0002\u0010oR\u001a\u0010Â\u0002\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÁ\u0002\u0010oR&\u0010Ä\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010G8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÃ\u0002\u0010IR\u001a\u0010Æ\u0002\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÅ\u0002\u0010\u0010R\u001a\u0010È\u0002\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÇ\u0002\u0010oR\u001a\u0010Ê\u0002\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÉ\u0002\u00108R\u001c\u0010Î\u0002\u001a\u0005\u0018\u00010Ë\u00028\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\bÌ\u0002\u0010Í\u0002R&\u0010Ð\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010G8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÏ\u0002\u0010IR\u001a\u0010Ò\u0002\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÑ\u0002\u0010oR\u001c\u0010Ö\u0002\u001a\u0005\u0018\u00010Ó\u00028\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\bÔ\u0002\u0010Õ\u0002¨\u0006Ø\u0002"}, d2 = {"Laj/r;", "", "", "a", "Ljava/lang/String;", "adIdPermission", "Ljava/util/ArrayList;", "Laj/a;", "Lkotlin/collections/ArrayList;", "b", "Ljava/util/ArrayList;", "adSizeArray", "c", "responsiveAutoFormat", "", "d", "Ljava/lang/Boolean;", "adaptiveSlot", "e", "format", "f", "fluidType", "g", "multipleAdSizeString", "", "h", "F", "screenDensity", "", "i", "I", "screenWidth", "j", "screenHeight", "k", "screenWidthDip", "l", "screenHeightDip", "m", "orientation", "n", "adUnitId", "o", "isRewarded", "p", "isRewardedInterstitial", "", "q", "J", "requestTimeMilliseconds", "r", "keywords", "s", "tagForChildDirectedTreatment", "Lnm/u;", "t", "Lnm/u;", "csrbEcoData", "u", "Z", "isTestRequest", "v", "manualImpressionsEnabled", "w", "publisherProvidedId", "x", "contentUrl", "", "y", "Ljava/util/Set;", "neighboringContentUrls", "", "z", "Ljava/util/Map;", "customTargeting", "A", "requestAgent", "B", "requestPackage", "C", "tagForUnderAgeOfConsent", "D", "maxAdContentRating", "E", "adResponseEncryptionKey", "adShieldSignal", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "adTypes", "", "Laj/c;", "H", "adapterVersionData", "appSwitched", "grantedPermissions", "Laj/m;", "K", "Laj/m;", "personallyIdentifiableInformation", "Laj/o;", "L", "Laj/o;", "qualitySignals", "M", "audioMode", "N", "isMusicActive", "O", "isSpeakerPhoneOn", "P", "musicVolume", "Q", "Ljava/lang/Integer;", "minMusicVolume", "R", "maxMusicVolume", "", "S", "Ljava/lang/Double;", "musicVolumePercent", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "ringerMode", "U", "ringerVolume", "V", "appVolume", "W", "isAppMuted", "Laj/h;", "X", "Laj/h;", "deviceSignals", "Y", "cacheKeySchema", "timeSinceCldUpdate", "a0", "adUnitRequestSignals", "Lnm/q;", "b0", "Lnm/q;", "adUnitRequestSignalsObject", "c0", "commonCldSignals", "d0", "commonCldSignalsObject", "e0", "consentString", "f0", "fundingChoicesConsentString", "Laj/i;", "g0", "Laj/i;", "iabConsentInfo", "Landroid/os/Bundle;", "h0", "Landroid/os/Bundle;", "sharedPreferenceSignals", "i0", "creativeToken", "j0", "debugSignalsEnabled", "k0", "isGbidTraffic", "l0", "hardwareAccelerationEnabled", "m0", "shouldCollectAdResponseLogs", "n0", "testMode", "o0", "linkedDevice", "p0", "inspectorExtras", "q0", "requestServerData", "r0", "omidVersion", "s0", "packageName", "t0", "versionCode", "u0", "versionName", "v0", "displayLabel", "w0", "requestId", "x0", "realTimeBiddingSignals", "z0", "adapterInitializationStatuses", "A0", "scarExperimentParameter", "B0", "gmpAppId", "C0", "appInstanceId", "D0", "adEventId", "E0", "appIdOrigin", "F0", "Ljava/lang/Long;", "timeoutMilliseconds", "G0", "afmaVersion", "H0", "isNonagon", "I0", "isDecagon", "J0", "additionalCapabilities", "K0", "targetApi", "L0", "dynamiteVersion", "M0", "localVersion", "N0", "granularVersion", "Laj/q;", "O0", "Laj/q;", "sdkEnvironment", "P0", "canOpenGeo", "Q0", "canOpenHttp", "R0", "countryCode", "S0", "isEmulator", "T0", "isLatchskyDevice", "U0", "languageCode", "V0", "languageCodeList", "W0", "marketVersion", "X0", "submodel", "Y0", "isBattlestarDevice", "Z0", "buildApiLevel", "a1", "carrierCode", "b1", "networkTypeCoarse", "c1", "networkTypeFine", "d1", "phoneType", "e1", "experimentIds", "f1", "transparentBackgroundSupported", "g1", "sessionId", "Laj/b;", "h1", "Laj/b;", "adUnitQualitySignals", "i1", "googleExtrasBundle", "j1", "debugExperimentId", "k1", "nativeVersion", "", "l1", "Ljava/util/List;", "nativeTemplates", "m1", "nativeCustomTemplates", "n1", "enableNativeMediaOrientation", "o1", "nativeMediaOrientation", "p1", "customMuteThisAdRequested", "q1", "customClickGestureDirection", "r1", "customClickGestureAllowTaps", "Laj/s;", "s1", "Laj/s;", "videoOptionsSignal", "t1", "isImageLoadingDisabled", "u1", "adChoicesPlacement", "v1", "numberOfRegisteredWebViews", "w1", "topics", "x1", "topicsApiStatus", "y1", "adServicesExtensionVersion", "z1", "isBannerRefreshRequest", "A1", "isIconAdRequest", "B1", "iconAdPlacement", "C1", "correlator", "D1", "usesMediaView", "E1", "installerPackage", "F1", "initiatorPackage", "G1", "signalType", "H1", "isScarRequest", "I1", "publisherPrivacyPersonalizationState", "J1", "isHsdpSupported", "K1", "preProcessedSignals", "L1", "isPrefetchRequest", "M1", "displayCount", "N1", "localSignals", "Laj/l;", "O1", "Laj/l;", "parentAdConfig", "P1", "inMemorySdkCoreData", "Q1", "numberOfAdsRequested", "Laj/g;", "R1", "Laj/g;", "clientRequestBuildingData", "ads_mobile_sdk/bl2", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: A, reason: from kotlin metadata */
    @om.b("request_agent")
    public String requestAgent;

    /* renamed from: A0, reason: from kotlin metadata */
    @om.b("query_info")
    public String scarExperimentParameter;

    /* renamed from: A1, reason: from kotlin metadata */
    @om.b("iconad")
    public Boolean isIconAdRequest;

    /* renamed from: B, reason: from kotlin metadata */
    @om.b("request_pkg")
    public String requestPackage;

    /* renamed from: B0, reason: from kotlin metadata */
    @om.b("gmp_app_id")
    public String gmpAppId;

    /* renamed from: B1, reason: from kotlin metadata */
    @om.b("iconad_placement")
    public Integer iconAdPlacement;

    /* renamed from: C, reason: from kotlin metadata */
    @om.b("tag_for_under_age_of_consent")
    public int tagForUnderAgeOfConsent;

    /* renamed from: C0, reason: from kotlin metadata */
    @om.b("fbs_aiid")
    public String appInstanceId;

    /* renamed from: C1, reason: from kotlin metadata */
    @om.b("correlation_id")
    public String correlator;

    /* renamed from: D, reason: from kotlin metadata */
    @om.b("max_ad_content_rating")
    public String maxAdContentRating;

    /* renamed from: D0, reason: from kotlin metadata */
    @om.b("fbs_aeid")
    public String adEventId;

    /* renamed from: D1, reason: from kotlin metadata */
    @om.b("uses_media_view")
    public Boolean usesMediaView;

    /* renamed from: E, reason: from kotlin metadata */
    @om.b("arek")
    public String adResponseEncryptionKey;

    /* renamed from: E0, reason: from kotlin metadata */
    @om.b("apm_id_origin")
    public String appIdOrigin;

    /* renamed from: E1, reason: from kotlin metadata */
    @om.b("ins_pn")
    public String installerPackage;

    /* renamed from: F, reason: from kotlin metadata */
    @om.b("ms")
    @NotNull
    public String adShieldSignal;

    /* renamed from: F0, reason: from kotlin metadata */
    @om.b("sai_timeout")
    public Long timeoutMilliseconds;

    /* renamed from: F1, reason: from kotlin metadata */
    @om.b("ini_pn")
    public String initiatorPackage;

    /* renamed from: G, reason: from kotlin metadata */
    @om.b("ad_types")
    @NotNull
    public final ArrayList<String> adTypes;

    /* renamed from: G0, reason: from kotlin metadata */
    @om.b("js")
    @NotNull
    public String afmaVersion;

    /* renamed from: G1, reason: from kotlin metadata */
    @om.b("signal_type")
    public String signalType;

    /* renamed from: H, reason: from kotlin metadata */
    @om.b("installed_adapter_data")
    @NotNull
    public final Map<String, c> adapterVersionData;

    /* renamed from: H0, reason: from kotlin metadata */
    @om.b("is_nonagon")
    public final boolean isNonagon;

    /* renamed from: H1, reason: from kotlin metadata */
    @om.b("scar")
    public Boolean isScarRequest;

    /* renamed from: I, reason: from kotlin metadata */
    @om.b("app_switched")
    public Boolean appSwitched;

    /* renamed from: I0, reason: from kotlin metadata */
    @om.b("is_decagon")
    public boolean isDecagon;

    /* renamed from: I1, reason: from kotlin metadata */
    @om.b("ppt_p13n")
    public Integer publisherPrivacyPersonalizationState;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    @om.b("android_permissions")
    @NotNull
    public final ArrayList<String> grantedPermissions;

    /* renamed from: J0, reason: from kotlin metadata */
    @om.b("extra_caps")
    public String additionalCapabilities;

    /* renamed from: J1, reason: from kotlin metadata */
    @om.b("lft")
    public Integer isHsdpSupported;

    /* renamed from: K, reason: from kotlin metadata */
    @om.b("pii")
    @NotNull
    public final m personallyIdentifiableInformation;

    /* renamed from: K0, reason: from kotlin metadata */
    @om.b("target_api")
    public Integer targetApi;

    /* renamed from: K1, reason: from kotlin metadata */
    @om.b("p_signals")
    public Map<String, String> preProcessedSignals;

    /* renamed from: L, reason: from kotlin metadata */
    @om.b("quality_signals")
    public o qualitySignals;

    /* renamed from: L0, reason: from kotlin metadata */
    @om.b("dv")
    public Integer dynamiteVersion;

    /* renamed from: L1, reason: from kotlin metadata */
    @om.b("is_sdk_preload")
    public Boolean isPrefetchRequest;

    /* renamed from: M, reason: from kotlin metadata */
    @om.b("am")
    public int audioMode;

    /* renamed from: M0, reason: from kotlin metadata */
    @om.b("lv")
    public Integer localVersion;

    /* renamed from: M1, reason: from kotlin metadata */
    @om.b("dspct")
    public Integer displayCount;

    /* renamed from: N, reason: from kotlin metadata */
    @om.b("ma")
    public boolean isMusicActive;

    /* renamed from: N0, reason: from kotlin metadata */
    @om.b("ev")
    public String granularVersion;

    /* renamed from: N1, reason: from kotlin metadata */
    @om.b("l_signals")
    public u localSignals;

    /* renamed from: O, reason: from kotlin metadata */
    @om.b("sp")
    public boolean isSpeakerPhoneOn;

    /* renamed from: O0, reason: from kotlin metadata */
    @om.b("sdk_env")
    @NotNull
    public final q sdkEnvironment;

    /* renamed from: O1, reason: from kotlin metadata */
    @om.b("parent_ad_config")
    public l parentAdConfig;

    /* renamed from: P, reason: from kotlin metadata */
    @om.b("muv")
    public int musicVolume;

    /* renamed from: P0, reason: from kotlin metadata */
    @om.b("cog")
    public Boolean canOpenGeo;

    /* renamed from: P1, reason: from kotlin metadata */
    @om.b("m_state")
    public Map<String, String> inMemorySdkCoreData;

    /* renamed from: Q, reason: from kotlin metadata */
    @om.b("muv_min")
    public Integer minMusicVolume;

    /* renamed from: Q0, reason: from kotlin metadata */
    @om.b("coh")
    public Boolean canOpenHttp;

    /* renamed from: Q1, reason: from kotlin metadata */
    @om.b("max_num_ads")
    public Integer numberOfAdsRequested;

    /* renamed from: R, reason: from kotlin metadata */
    @om.b("muv_max")
    public Integer maxMusicVolume;

    /* renamed from: R0, reason: from kotlin metadata */
    @om.b("gl")
    public String countryCode;

    /* renamed from: R1, reason: from kotlin metadata */
    @om.b("csrb_output")
    public g clientRequestBuildingData;

    /* renamed from: S, reason: from kotlin metadata */
    @om.b("muv_percent")
    public Double musicVolumePercent;

    /* renamed from: S0, reason: from kotlin metadata */
    @om.b("simulator")
    public Boolean isEmulator;

    /* renamed from: T, reason: from kotlin metadata */
    @om.b("rm")
    public int ringerMode;

    /* renamed from: T0, reason: from kotlin metadata */
    @om.b("is_latchsky")
    public boolean isLatchskyDevice;

    /* renamed from: U, reason: from kotlin metadata */
    @om.b("riv")
    public int ringerVolume;

    /* renamed from: U0, reason: from kotlin metadata */
    @om.b("hl")
    public String languageCode;

    /* renamed from: V, reason: from kotlin metadata */
    @om.b("android_app_volume")
    public float appVolume;

    /* renamed from: V0, reason: from kotlin metadata */
    @om.b("hl_list")
    @NotNull
    public final ArrayList<String> languageCodeList;

    /* renamed from: W, reason: from kotlin metadata */
    @om.b("android_app_muted")
    public boolean isAppMuted;

    /* renamed from: W0, reason: from kotlin metadata */
    @om.b("mv")
    public String marketVersion;

    /* renamed from: X, reason: from kotlin metadata */
    @om.b("device")
    @NotNull
    public final h deviceSignals;

    /* renamed from: X0, reason: from kotlin metadata */
    @om.b("submodel")
    public String submodel;

    /* renamed from: Y, reason: from kotlin metadata */
    @om.b("key_schema")
    public String cacheKeySchema;

    /* renamed from: Y0, reason: from kotlin metadata */
    @om.b("is_bstar")
    public Boolean isBattlestarDevice;

    /* renamed from: Z, reason: from kotlin metadata */
    @om.b("cldut")
    public long timeSinceCldUpdate;

    /* renamed from: Z0, reason: from kotlin metadata */
    @om.b("build_api_level")
    public Integer buildApiLevel;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("adid_p")
    @NotNull
    public String adIdPermission;

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata */
    @om.b("fwd_cld")
    public String adUnitRequestSignals;

    /* renamed from: a1, reason: collision with root package name and from kotlin metadata */
    @om.b("carrier")
    public String carrierCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("valid_ad_sizes")
    @NotNull
    public final ArrayList<a> adSizeArray;

    /* renamed from: b0, reason: collision with root package name and from kotlin metadata */
    @om.b("fwd_cld_obj")
    public nm.q adUnitRequestSignalsObject;

    /* renamed from: b1, reason: collision with root package name and from kotlin metadata */
    @om.b("cnt")
    public Integer networkTypeCoarse;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("rafmt")
    public String responsiveAutoFormat;

    /* renamed from: c0, reason: collision with root package name and from kotlin metadata */
    @om.b("fwd_common_cld")
    public String commonCldSignals;

    /* renamed from: c1, reason: collision with root package name and from kotlin metadata */
    @om.b("gnt")
    public Integer networkTypeFine;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("inline_adaptive_slot")
    public Boolean adaptiveSlot;

    /* renamed from: d0, reason: collision with root package name and from kotlin metadata */
    @om.b("fwd_common_cld_obj")
    public u commonCldSignalsObject;

    /* renamed from: d1, reason: collision with root package name and from kotlin metadata */
    @om.b("pt")
    public Integer phoneType;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @om.b("format")
    public String format;

    /* renamed from: e0, reason: collision with root package name and from kotlin metadata */
    @om.b("consent_string")
    @NotNull
    public String consentString;

    /* renamed from: e1, reason: collision with root package name and from kotlin metadata */
    @om.b("eid")
    public String experimentIds;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @om.b("fluid")
    public String fluidType;

    /* renamed from: f0, reason: collision with root package name and from kotlin metadata */
    @om.b("fc_consent")
    @NotNull
    public String fundingChoicesConsentString;

    /* renamed from: f1, reason: collision with root package name and from kotlin metadata */
    @om.b("support_transparent_background")
    public Boolean transparentBackgroundSupported;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @om.b("sz")
    public String multipleAdSizeString;

    /* renamed from: g0, reason: collision with root package name and from kotlin metadata */
    @om.b("iab_consent_info")
    @NotNull
    public i iabConsentInfo;

    /* renamed from: g1, reason: collision with root package name and from kotlin metadata */
    @om.b("session_id")
    public String sessionId;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @om.b("u_sd")
    public float screenDensity;

    /* renamed from: h0, reason: collision with root package name and from kotlin metadata */
    @om.b("shared_pref")
    @NotNull
    public Bundle sharedPreferenceSignals;

    /* renamed from: h1, reason: collision with root package name and from kotlin metadata */
    @om.b("ad_unit_quality_signals")
    public b adUnitQualitySignals;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @om.b("sw")
    public int screenWidth;

    /* renamed from: i0, reason: collision with root package name and from kotlin metadata */
    @om.b("gct")
    public String creativeToken;

    /* renamed from: i1, reason: collision with root package name and from kotlin metadata */
    @om.b("extras")
    public Bundle googleExtrasBundle;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @om.b("sh")
    public int screenHeight;

    /* renamed from: j0, reason: collision with root package name and from kotlin metadata */
    @om.b("de")
    public String debugSignalsEnabled;

    /* renamed from: j1, reason: collision with root package name and from kotlin metadata */
    @om.b("debug_experiment_id")
    public Integer debugExperimentId;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @om.b("u_w")
    public int screenWidthDip;

    /* renamed from: k0, reason: collision with root package name and from kotlin metadata */
    @om.b("is_gbid")
    public boolean isGbidTraffic;

    /* renamed from: k1, reason: collision with root package name and from kotlin metadata */
    @om.b("native_version")
    public Integer nativeVersion;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @om.b("u_h")
    public int screenHeightDip;

    /* renamed from: l0, reason: collision with root package name and from kotlin metadata */
    @om.b("hw_accel")
    public Boolean hardwareAccelerationEnabled;

    /* renamed from: l1, reason: collision with root package name and from kotlin metadata */
    @om.b("native_templates")
    public List<String> nativeTemplates;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @om.b("u_so")
    public String orientation;

    /* renamed from: m0, reason: collision with root package name and from kotlin metadata */
    @om.b("collect_response_logs")
    public Boolean shouldCollectAdResponseLogs;

    /* renamed from: m1, reason: collision with root package name and from kotlin metadata */
    @om.b("native_custom_templates")
    public List<String> nativeCustomTemplates;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @om.b("slotname")
    public String adUnitId;

    /* renamed from: n0, reason: collision with root package name and from kotlin metadata */
    @om.b("test_mode")
    public int testMode;

    /* renamed from: n1, reason: collision with root package name and from kotlin metadata */
    @om.b("enable_native_media_orientation")
    public Boolean enableNativeMediaOrientation;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @om.b("rbv")
    public Boolean isRewarded;

    /* renamed from: o0, reason: collision with root package name and from kotlin metadata */
    @om.b("linked_device")
    public int linkedDevice;

    /* renamed from: o1, reason: collision with root package name and from kotlin metadata */
    @om.b("native_media_orientation")
    public String nativeMediaOrientation;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @om.b("rbi")
    public Boolean isRewardedInterstitial;

    /* renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @om.b("inspector_extras")
    public String inspectorExtras;

    /* renamed from: p1, reason: collision with root package name and from kotlin metadata */
    @om.b("use_custom_mute")
    public Boolean customMuteThisAdRequested;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @om.b("start_signals_timestamp")
    public long requestTimeMilliseconds;

    /* renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @om.b("risd")
    public Integer requestServerData;

    /* renamed from: q1, reason: collision with root package name and from kotlin metadata */
    @om.b("sccg_dir")
    public Integer customClickGestureDirection;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @om.b("kw")
    public ArrayList<String> keywords;

    /* renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @om.b("omid_v")
    public String omidVersion;

    /* renamed from: r1, reason: collision with root package name and from kotlin metadata */
    @om.b("sccg_tap")
    public Boolean customClickGestureAllowTaps;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @om.b("tag_for_child_directed_treatment")
    public int tagForChildDirectedTreatment;

    /* renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @om.b("pn")
    @NotNull
    public String packageName;

    /* renamed from: s1, reason: collision with root package name and from kotlin metadata */
    @om.b("video")
    public s videoOptionsSignal;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @om.b("eco")
    public u csrbEcoData;

    /* renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @om.b("vc")
    public Integer versionCode;

    /* renamed from: t1, reason: collision with root package name and from kotlin metadata */
    @om.b("disable_image_loading")
    public Boolean isImageLoadingDisabled;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @om.b("test_request")
    public boolean isTestRequest;

    /* renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @om.b("vnm")
    public String versionName;

    /* renamed from: u1, reason: collision with root package name and from kotlin metadata */
    @om.b("preferred_ad_choices_position")
    public Integer adChoicesPlacement;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @om.b("d_imp_hdr")
    public boolean manualImpressionsEnabled;

    /* renamed from: v0, reason: collision with root package name and from kotlin metadata */
    @om.b("dl")
    public String displayLabel;

    /* renamed from: v1, reason: collision with root package name and from kotlin metadata */
    @om.b("nrwv")
    public Integer numberOfRegisteredWebViews;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @om.b("ppid")
    public String publisherProvidedId;

    /* renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @om.b("request_id")
    public String requestId;

    /* renamed from: w1, reason: collision with root package name and from kotlin metadata */
    @om.b("topics")
    public String topics;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @om.b("url")
    public String contentUrl;

    /* renamed from: x0, reason: collision with root package name and from kotlin metadata */
    @om.b("rtb")
    public String realTimeBiddingSignals;

    /* renamed from: x1, reason: collision with root package name and from kotlin metadata */
    @om.b("atps")
    public Integer topicsApiStatus;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @om.b("neighboring_content_urls")
    public Set<String> neighboringContentUrls;

    /* renamed from: y0, reason: collision with root package name */
    public List f15394y0;

    /* renamed from: y1, reason: collision with root package name and from kotlin metadata */
    @om.b("aos")
    public int adServicesExtensionVersion;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @om.b("custom_targeting")
    public Map<String, String> customTargeting;

    /* renamed from: z0, reason: collision with root package name and from kotlin metadata */
    @om.b("adapter_initialization_status")
    @NotNull
    public final Map<String, Integer> adapterInitializationStatuses;

    /* renamed from: z1, reason: collision with root package name and from kotlin metadata */
    @om.b("ibrr")
    public Boolean isBannerRefreshRequest;

    public r() {
        ArrayList<a> arrayList = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<String> arrayList3 = new ArrayList<>();
        m mVar = new m(0);
        h hVar = new h(0);
        i iVar = new i(0);
        Bundle bundle = new Bundle();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        q qVar = new q(0);
        ArrayList<String> arrayList4 = new ArrayList<>();
        this.adIdPermission = "0";
        this.adSizeArray = arrayList;
        this.responsiveAutoFormat = null;
        this.adaptiveSlot = null;
        this.format = null;
        this.fluidType = null;
        this.multipleAdSizeString = null;
        this.screenDensity = 0.0f;
        this.screenWidth = 0;
        this.screenHeight = 0;
        this.screenWidthDip = 0;
        this.screenHeightDip = 0;
        this.orientation = null;
        this.adUnitId = "";
        this.isRewarded = null;
        this.isRewardedInterstitial = null;
        this.requestTimeMilliseconds = 0L;
        this.keywords = null;
        this.tagForChildDirectedTreatment = 0;
        this.csrbEcoData = null;
        this.isTestRequest = false;
        this.manualImpressionsEnabled = false;
        this.publisherProvidedId = null;
        this.contentUrl = null;
        this.neighboringContentUrls = null;
        this.customTargeting = null;
        this.requestAgent = null;
        this.requestPackage = null;
        this.tagForUnderAgeOfConsent = 0;
        this.maxAdContentRating = null;
        this.adResponseEncryptionKey = null;
        this.adShieldSignal = "";
        this.adTypes = arrayList2;
        this.adapterVersionData = linkedHashMap;
        this.appSwitched = null;
        this.grantedPermissions = arrayList3;
        this.personallyIdentifiableInformation = mVar;
        this.qualitySignals = null;
        this.audioMode = 0;
        this.isMusicActive = false;
        this.isSpeakerPhoneOn = false;
        this.musicVolume = 0;
        this.minMusicVolume = null;
        this.maxMusicVolume = null;
        this.musicVolumePercent = null;
        this.ringerMode = 0;
        this.ringerVolume = 0;
        this.appVolume = 0.0f;
        this.isAppMuted = false;
        this.deviceSignals = hVar;
        this.cacheKeySchema = null;
        this.timeSinceCldUpdate = 0L;
        this.adUnitRequestSignals = null;
        this.adUnitRequestSignalsObject = null;
        this.commonCldSignals = null;
        this.commonCldSignalsObject = null;
        this.consentString = "";
        this.fundingChoicesConsentString = "";
        this.iabConsentInfo = iVar;
        this.sharedPreferenceSignals = bundle;
        this.creativeToken = null;
        this.debugSignalsEnabled = null;
        this.isGbidTraffic = false;
        this.hardwareAccelerationEnabled = null;
        this.shouldCollectAdResponseLogs = null;
        this.testMode = 0;
        this.linkedDevice = 0;
        this.inspectorExtras = null;
        this.requestServerData = null;
        this.omidVersion = null;
        this.packageName = "";
        this.versionCode = null;
        this.versionName = null;
        this.displayLabel = null;
        this.requestId = null;
        this.realTimeBiddingSignals = null;
        this.f15394y0 = null;
        this.adapterInitializationStatuses = linkedHashMap2;
        this.scarExperimentParameter = null;
        this.gmpAppId = null;
        this.appInstanceId = null;
        this.adEventId = null;
        this.appIdOrigin = null;
        this.timeoutMilliseconds = null;
        this.afmaVersion = "";
        this.isNonagon = false;
        this.isDecagon = true;
        this.additionalCapabilities = null;
        this.targetApi = null;
        this.dynamiteVersion = null;
        this.localVersion = null;
        this.granularVersion = null;
        this.sdkEnvironment = qVar;
        this.canOpenGeo = null;
        this.canOpenHttp = null;
        this.countryCode = null;
        this.isEmulator = null;
        this.isLatchskyDevice = false;
        this.languageCode = null;
        this.languageCodeList = arrayList4;
        this.marketVersion = null;
        this.submodel = null;
        this.isBattlestarDevice = null;
        this.buildApiLevel = null;
        this.carrierCode = null;
        this.networkTypeCoarse = null;
        this.networkTypeFine = null;
        this.phoneType = null;
        this.experimentIds = null;
        this.transparentBackgroundSupported = null;
        this.sessionId = null;
        this.adUnitQualitySignals = null;
        this.googleExtrasBundle = null;
        this.debugExperimentId = null;
        this.nativeVersion = null;
        this.nativeTemplates = null;
        this.nativeCustomTemplates = null;
        this.enableNativeMediaOrientation = null;
        this.nativeMediaOrientation = null;
        this.customMuteThisAdRequested = null;
        this.customClickGestureDirection = null;
        this.customClickGestureAllowTaps = null;
        this.videoOptionsSignal = null;
        this.isImageLoadingDisabled = null;
        this.adChoicesPlacement = null;
        this.numberOfRegisteredWebViews = null;
        this.topics = null;
        this.topicsApiStatus = null;
        this.adServicesExtensionVersion = 0;
        this.isBannerRefreshRequest = null;
        this.isIconAdRequest = null;
        this.iconAdPlacement = null;
        this.correlator = null;
        this.usesMediaView = null;
        this.installerPackage = null;
        this.initiatorPackage = null;
        this.signalType = null;
        this.isScarRequest = null;
        this.publisherPrivacyPersonalizationState = null;
        this.isHsdpSupported = null;
        this.preProcessedSignals = null;
        this.isPrefetchRequest = null;
        this.displayCount = null;
        this.localSignals = null;
        this.parentAdConfig = null;
        this.inMemorySdkCoreData = null;
        this.numberOfAdsRequested = null;
        this.clientRequestBuildingData = null;
    }
}
