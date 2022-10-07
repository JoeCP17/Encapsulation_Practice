package abstract_practice.example_1;

import java.util.ArrayList;
import java.util.List;

public class CloudFileManager {

    // 개선 전
//    public List<FileInto> getFileInfos(CloudId cloudId) {
//        if (cloudId == CloudId.DROPBOX) {
//            DropboxClient dc = ...;
//            List<DbFile> dbFiles = db.getFiles();
//            List<FileInfo> result = new ArrayList<>();
//            for (DbFile dbFile : dbFiles) {
//                FileInfo fi = new FileInfo();
//                fi.setCloudId(CloudId.DROPBOX);
//                fi.setFileId(fi.getFileId());
//
//                ...
//
//                result.add(fi);
//            }
//            return result;
//        } else if (cloudId == CloudId.BOX) {
//            BoxService boxSvc = ...;
//            .. //
//        }
//    }


}
