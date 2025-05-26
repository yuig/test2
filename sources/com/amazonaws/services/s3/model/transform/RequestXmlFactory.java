package com.amazonaws.services.s3.model.transform;

import com.amazonaws.services.s3.internal.XmlWriter;
import com.amazonaws.services.s3.model.PartETag;
import com.amazonaws.util.StringUtils;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class RequestXmlFactory {
    public static byte[] a(List list) {
        XmlWriter xmlWriter = new XmlWriter();
        xmlWriter.b("CompleteMultipartUpload");
        if (list != null) {
            Collections.sort(list, new Comparator<PartETag>() { // from class: com.amazonaws.services.s3.model.transform.RequestXmlFactory.1
                @Override // java.util.Comparator
                public final int compare(PartETag partETag, PartETag partETag2) {
                    int i13 = partETag.f28896a;
                    int i14 = partETag2.f28896a;
                    if (i13 < i14) {
                        return -1;
                    }
                    return i13 > i14 ? 1 : 0;
                }
            });
            Iterator it = list.iterator();
            while (it.hasNext()) {
                PartETag partETag = (PartETag) it.next();
                xmlWriter.b("Part");
                xmlWriter.b("PartNumber");
                xmlWriter.c(Integer.toString(partETag.f28896a));
                xmlWriter.a();
                xmlWriter.b("ETag");
                xmlWriter.c(partETag.f28897b);
                xmlWriter.a();
                xmlWriter.a();
            }
        }
        xmlWriter.a();
        return xmlWriter.f28824b.toString().getBytes(StringUtils.f29048a);
    }
}
