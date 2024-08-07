package LMS;
 
    public class Member {
        private String MemberID;
        private String Name;
        private String Address;
        private String contactNumber;
        private String Email;
        private int payment;
    
        public Member(String Name,String MemberID, String contactNumber,String Address,String Email,int payment) {
            this.Name = Name;
            this.contactNumber = contactNumber;
            this.Address = Address;
            this.Email = Email;
            this.MemberID = MemberID;
            this. payment = payment;
        }
    
        public String getName() 
        {
            return Name;
        }
    
        public String getcontactNumber () 
        {
            return contactNumber;
        }

        public String getMemberID () 
        {
            return MemberID;
        }

        public String getAddress () 
        {
            return  Address;
        }

        public String getEmail() 
        {
            return Email;
        }

        public int getpayment () 
        {
            return payment;
        }
    }
    
 
